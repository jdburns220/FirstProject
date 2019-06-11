import dev.spiti.utility.datareader.readers.CSV;
import dev.spiti.utility.datareader.readers.Excel;

public class MyReader {

    public void readExcel(String fileName, String sheetName) {

        System.out.println("---------------------------------------------------------");
        System.out.println("My Excel Test.");
        System.out.println("");

        try{
            Excel myExcelTest = new Excel(fileName, sheetName);
            myExcelTest.getData();
            System.out.println(myExcelTest.data);
        }catch(NullPointerException e){
            e.printStackTrace();
            System.out.println("You probably have an empty column!");
        }catch (Exception e1){
            e1.printStackTrace();
        }

        System.out.println("---------------------------------------------------------");
    }

    public void readCSV(String fileName) {

        System.out.println("---------------------------------------------------------");
        System.out.println("My CSV Test.");
        System.out.println("");

        try{
            CSV myCsvTest = new CSV("TestCSV");
            myCsvTest.getData();
            System.out.println(myCsvTest.data);
            System.out.println("---------------------------------------------------------");
        }catch (Exception e1){
            e1.printStackTrace();
        }

        System.out.println("---------------------------------------------------------");
    }
}
