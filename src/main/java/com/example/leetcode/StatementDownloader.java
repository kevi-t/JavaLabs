package com.example.leetcode;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.util.List;
public class StatementDownloader {

    public static void main(String[] args) {
        // Database connection settings
        String jdbcUrl = "jdbc:oracle:thin:@//drsc01-testdb-scan.kplc.local:1521/incmsqa";
        String username = "kpl19409";
        String password = "T33FuscL$2RT#ywF32ertyq";

        // Endpoint URL
        String endpointUrl = "http://incms.kplc.local/InCMS-ss-server/services/balancePdf/3/";

        // Sample list of entry IDs
        List<String> entryIds = List.of("26976399", "100477138", "48892622");

        // Create a directory for PDF files
        Path pdfFolder = Path.of(System.getProperty("user.home"), "Documents", "Statement_PDF_Files");
        try {
            Files.createDirectories(pdfFolder);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // Get the current timestamp
        long epochTimestamp = Instant.now().toEpochMilli();

        // JDBC variables
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
             for (String entryId : entryIds) {
                  // Fetch variable value from the database
                  String query = "SELECT ID_PAYMENT_FORM FROM INCMS_ADMINIS.GCCOM_PAYMENT_FORM WHERE REFERENCE = ?";
                    try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                        preparedStatement.setString(1, entryId);
                        try (ResultSet resultSet = preparedStatement.executeQuery()) {
                            if (resultSet.next()) {
                                String variableValue = resultSet.getString(1);

                                // Construct the URL for the endpoint
                                URI uri = URI.create(endpointUrl + "/?encoded=false&fromDate=1483218000000&idPaymentForm=" +
                                        variableValue + "&toDate=" + epochTimestamp);

                                // Make an HTTP request to the endpoint
                                HttpClient client = HttpClient.newHttpClient();
                                HttpRequest request = HttpRequest.newBuilder(uri).build();
                                HttpResponse<InputStream> response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());

                                // Save the PDF file
                                String filename = "Account_Statement_" + entryId + ".pdf";
                                Path filePath = pdfFolder.resolve(filename);
                                Files.copy(response.body(), filePath, StandardCopyOption.REPLACE_EXISTING);

                                System.out.println("Downloaded " + filename);
                            }
                        }
                    }
                }
            }
        catch (SQLException | IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }