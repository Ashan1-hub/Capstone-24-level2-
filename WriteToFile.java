/**This code is a Java class called "WriteToFile" that writes the data from an object of the "ProjectList" class
* to a file called "ProjectDataList.txt". The class has one attribute, "projectList", which is an instance of
* the "ProjectList" class. The class also has one constructor, which initializes the "projectList" attribute
*by calling the "getOnlyList()" method of the "ProjectList" class. The class also has one method called 
*"writeToFile()" which writes the data from the "projectList" object to the "ProjectDataList.txt" file using 
*a FileWriter object. If an exception occurs while trying to write to the file, the exception message is 
*printed to the console. 
*/ 
import java.io.FileWriter;

class WriteToFile{
    //attributes
    private ProjectList projectList;

    public WriteToFile() {
        projectList = ProjectList.getOnlyList();
    }

    public void writeToFile(){
        try{
            FileWriter fw=new FileWriter("ProjectDataList.txt");
            fw.write(projectList.toFile());
            fw.close();
        }catch(Exception e){System.out.println(e);}
    }
}