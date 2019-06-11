
public class Main {
    public static void main(String[] args){


        MyReader readfiles = new MyReader();
        //Excel
        readfiles.readExcel("Test1","Sheet1");

        //CSV
        readfiles.readCSV("TestCSV");

    }
}
