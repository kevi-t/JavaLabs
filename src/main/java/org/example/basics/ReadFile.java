//package org.example;
//
//import org.apache.poi.ss.usermodel.*;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ReadFile {
//    private String path = "C:/datasets/contacts.xlsx";
//
//    public List<String> readPhoneNumbersFromExcel() {
//        List<String> phoneNumbers = new ArrayList<>();
//
//        try (FileInputStream fileInputStream = new FileInputStream(new File(path))) {
//            Workbook workbook = WorkbookFactory.create(fileInputStream);
//            Sheet sheet = workbook.getSheetAt(0); // Assuming the phone numbers are in the first sheet
//
//            int phoneColumnIndex = 4; // Column E is the 5th column, index 4
//
//            // Iterate through the rows to read phone numbers, starting from the second row
//            for (int i = 1; i <= sheet.getLastRowNum(); i++) { // Start from 1 to skip the header row
//                Row row = sheet.getRow(i);
//                if (row != null) {
//                    Cell cell = row.getCell(phoneColumnIndex, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
//                    if (cell.getCellType() == CellType.STRING) {
//                        String phoneNumber = cell.getStringCellValue().trim();
//                        phoneNumbers.add(phoneNumber);
//                    }
//                }
//            }
//        } catch (IOException | InvalidFormatException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(phoneNumbers); // Print the list of phone numbers for verification
//
//        return phoneNumbers;
//    }
//
//    public static void main(String[] args) {
//        ReadFile readFile = new ReadFile();
//        List<String> phoneNumbers = readFile.readPhoneNumbersFromExcel();
//        // You can further process the phone numbers here as needed
//    }
//}
