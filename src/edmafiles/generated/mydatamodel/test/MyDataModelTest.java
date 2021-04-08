package edmafiles.generated.mydatamodel.test;

import edmafiles.generated.mydatamodel.MyDataModel;
import edmafiles.generated.mydatamodel.actions.AssignStudentToCourseResult;
import edmafiles.generated.mydatamodel.actions.AssignTeacherToCourseResult;
import edmafiles.generated.mydatamodel.actions.CreateCourseResult;
import edmafiles.generated.mydatamodel.actions.CreatePersonResult;
import edmafiles.generated.mydatamodel.actions.CreateTeacherResult;
import edmafiles.generated.mydatamodel.views.GetAllCoursesResult;
import edmafiles.generated.mydatamodel.views.GetAllPersonsResult;
import edmafiles.generated.mydatamodel.views.GetCourseStudentsResult;
import edmafiles.generated.mydatamodel.views.GetCourseTeacherResult;
import edmafiles.generated.valuedomains.Email;
import edmafiles.generated.valuedomains.Name;
import edmafiles.generated.valuedomains.mydatamodel.CourseID;
import edmafiles.generated.valuedomains.mydatamodel.PersonID;
import edmafiles.generated.valuedomains.mydatamodel.TeacherID;
import java.io.IOException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;

/**
 * 
 */
public class MyDataModelTest
{
    private MyDataModel edma_dm;
    private ITerminal edma_terminal;



    /**
     * Constructor
     * @param edma_dm        Interface to an instance of the MyDataModel data
     *                       model
     * @param edma_terminal  Terminal to get value domains from
     */
    public MyDataModelTest(MyDataModel edma_dm, ITerminal edma_terminal)
    {
        this.edma_dm = edma_dm;
        this.edma_terminal = edma_terminal;
    }

    /**
     * Starts the test
     */
    public void start() throws IOException
    {
        while(true)
        {
            menu();
            String val = readInputLine();
            if("exit".equalsIgnoreCase(val)) break;
            try
            {
                int choice = Integer.parseInt(val);
                switch(choice)
                {
                    case 1:
                        callCreatePerson();
                        break;
                    case 2:
                        callCreateTeacher();
                        break;
                    case 3:
                        callCreateCourse();
                        break;
                    case 4:
                        callAssignStudentToCourse();
                        break;
                    case 5:
                        callAssignTeacherToCourse();
                        break;
                    case 6:
                        callGetAllPersons();
                        break;
                    case 7:
                        callGetAllCourses();
                        break;
                    case 8:
                        callGetCourseStudents();
                        break;
                    case 9:
                        callGetCourseTeacher();
                        break;
                    default:
                        edma_terminal.put(choice + " does not exist! Please try again!\n");
                }
            }
            catch(NumberFormatException e)
            {
                edma_terminal.put(val + " is not a valid input! Please try again!\n");
            }
        }
    }

    /**
     * Prints the menu
     */
    private void menu()
    {
        edma_terminal.put("Welcome to the MyDataModel interactive test!\n");
        edma_terminal.put("************************************************************************\n");
        edma_terminal.put("  Actions\n  -------\n");
        edma_terminal.put("    1 - createPerson(firstName : Name, lastName : Name, email : Email) -> (id : PersonID)\n");
        edma_terminal.put("    2 - createTeacher(firstName : Name, lastName : Name, email : Email) -> (id : TeacherID)\n");
        edma_terminal.put("    3 - createCourse(name : Name) -> (id : CourseID)\n");
        edma_terminal.put("    4 - assignStudentToCourse(studentID : PersonID, courseID : CourseID) -> ()\n");
        edma_terminal.put("    5 - assignTeacherToCourse(teacherID : TeacherID, courseID : CourseID) -> ()\n");
        edma_terminal.put("  Views\n  -----\n");
        edma_terminal.put("    6 - getAllPersons() -> (personList : PersonList)\n");
        edma_terminal.put("    7 - getAllCourses() -> (courseList : CourseList)\n");
        edma_terminal.put("    8 - getCourseStudents(courseID : CourseID) -> (studentList : PersonList)\n");
        edma_terminal.put("    9 - getCourseTeacher(courseID : CourseID) -> (teacher : Teacher)\n");
        edma_terminal.put("Please choose a transaction to call (or type exit to exit):\n");
    }

    /**
     * Reads a line from stdin
     * @return  
     */
    private String readInputLine()
    {
        edma_terminal.put(": ");
        return edma_terminal.getString();
    }

    /**
     * Calls the method: createPerson
     */
    private void callCreatePerson() throws IOException
    {
        
        //Input parameter firstName
        Name in_firstName;
        edma_terminal.put("Enter input parameter firstName : Name\n");
        in_firstName = Name.fromTerminal(edma_terminal);
        
        //Input parameter lastName
        Name in_lastName;
        edma_terminal.put("Enter input parameter lastName : Name\n");
        in_lastName = Name.fromTerminal(edma_terminal);
        
        //Input parameter email
        Email in_email;
        edma_terminal.put("Enter input parameter email : Email\n");
        in_email = Email.fromTerminal(edma_terminal);
        
        //Make the call
        CreatePersonResult res = edma_dm.createPerson(in_firstName, in_lastName, in_email);
        
        //Print the result
        edma_terminal.put("\n\nResult: " + res.errorCode() + " - " + res.errorMessage() + "\n");
        if(res.errorDescription() != null)
        {
            edma_terminal.put("Extra info: " + res.errorDescription() + "\n");
        }
        edma_terminal.put("\nOutput parameter id:\n");
        edma_terminal.put("  " + res.getId() + "\n");
        edma_terminal.put("Press return to continue!\n");
        readInputLine();
    }

    /**
     * Calls the method: createTeacher
     */
    private void callCreateTeacher() throws IOException
    {
        
        //Input parameter firstName
        Name in_firstName;
        edma_terminal.put("Enter input parameter firstName : Name\n");
        in_firstName = Name.fromTerminal(edma_terminal);
        
        //Input parameter lastName
        Name in_lastName;
        edma_terminal.put("Enter input parameter lastName : Name\n");
        in_lastName = Name.fromTerminal(edma_terminal);
        
        //Input parameter email
        Email in_email;
        edma_terminal.put("Enter input parameter email : Email\n");
        in_email = Email.fromTerminal(edma_terminal);
        
        //Make the call
        CreateTeacherResult res = edma_dm.createTeacher(in_firstName, in_lastName, in_email);
        
        //Print the result
        edma_terminal.put("\n\nResult: " + res.errorCode() + " - " + res.errorMessage() + "\n");
        if(res.errorDescription() != null)
        {
            edma_terminal.put("Extra info: " + res.errorDescription() + "\n");
        }
        edma_terminal.put("\nOutput parameter id:\n");
        edma_terminal.put("  " + res.getId() + "\n");
        edma_terminal.put("Press return to continue!\n");
        readInputLine();
    }

    /**
     * Calls the method: createCourse
     */
    private void callCreateCourse() throws IOException
    {
        
        //Input parameter name
        Name in_name;
        edma_terminal.put("Enter input parameter name : Name\n");
        in_name = Name.fromTerminal(edma_terminal);
        
        //Make the call
        CreateCourseResult res = edma_dm.createCourse(in_name);
        
        //Print the result
        edma_terminal.put("\n\nResult: " + res.errorCode() + " - " + res.errorMessage() + "\n");
        if(res.errorDescription() != null)
        {
            edma_terminal.put("Extra info: " + res.errorDescription() + "\n");
        }
        edma_terminal.put("\nOutput parameter id:\n");
        edma_terminal.put("  " + res.getId() + "\n");
        edma_terminal.put("Press return to continue!\n");
        readInputLine();
    }

    /**
     * Calls the method: assignStudentToCourse
     */
    private void callAssignStudentToCourse() throws IOException
    {
        
        //Input parameter studentID
        PersonID in_studentID;
        edma_terminal.put("Enter input parameter studentID : PersonID\n");
        in_studentID = PersonID.fromTerminal(edma_terminal);
        
        //Input parameter courseID
        CourseID in_courseID;
        edma_terminal.put("Enter input parameter courseID : CourseID\n");
        in_courseID = CourseID.fromTerminal(edma_terminal);
        
        //Make the call
        AssignStudentToCourseResult res = edma_dm.assignStudentToCourse(in_studentID, in_courseID);
        
        //Print the result
        edma_terminal.put("\n\nResult: " + res.errorCode() + " - " + res.errorMessage() + "\n");
        if(res.errorDescription() != null)
        {
            edma_terminal.put("Extra info: " + res.errorDescription() + "\n");
        }
        edma_terminal.put("Press return to continue!\n");
        readInputLine();
    }

    /**
     * Calls the method: assignTeacherToCourse
     */
    private void callAssignTeacherToCourse() throws IOException
    {
        
        //Input parameter teacherID
        TeacherID in_teacherID;
        edma_terminal.put("Enter input parameter teacherID : TeacherID\n");
        in_teacherID = TeacherID.fromTerminal(edma_terminal);
        
        //Input parameter courseID
        CourseID in_courseID;
        edma_terminal.put("Enter input parameter courseID : CourseID\n");
        in_courseID = CourseID.fromTerminal(edma_terminal);
        
        //Make the call
        AssignTeacherToCourseResult res = edma_dm.assignTeacherToCourse(in_teacherID, in_courseID);
        
        //Print the result
        edma_terminal.put("\n\nResult: " + res.errorCode() + " - " + res.errorMessage() + "\n");
        if(res.errorDescription() != null)
        {
            edma_terminal.put("Extra info: " + res.errorDescription() + "\n");
        }
        edma_terminal.put("Press return to continue!\n");
        readInputLine();
    }

    /**
     * Calls the method: getAllPersons
     */
    private void callGetAllPersons() throws IOException
    {
        
        //Make the call
        GetAllPersonsResult res = edma_dm.getAllPersons();
        
        //Print the result
        edma_terminal.put("\n\nResult: " + res.errorCode() + " - " + res.errorMessage() + "\n");
        if(res.errorDescription() != null)
        {
            edma_terminal.put("Extra info: " + res.errorDescription() + "\n");
        }
        edma_terminal.put("\nOutput parameter personList:\n");
        edma_terminal.put("  " + res.getPersonList() + "\n");
        edma_terminal.put("Press return to continue!\n");
        readInputLine();
    }

    /**
     * Calls the method: getAllCourses
     */
    private void callGetAllCourses() throws IOException
    {
        
        //Make the call
        GetAllCoursesResult res = edma_dm.getAllCourses();
        
        //Print the result
        edma_terminal.put("\n\nResult: " + res.errorCode() + " - " + res.errorMessage() + "\n");
        if(res.errorDescription() != null)
        {
            edma_terminal.put("Extra info: " + res.errorDescription() + "\n");
        }
        edma_terminal.put("\nOutput parameter courseList:\n");
        edma_terminal.put("  " + res.getCourseList() + "\n");
        edma_terminal.put("Press return to continue!\n");
        readInputLine();
    }

    /**
     * Calls the method: getCourseStudents
     */
    private void callGetCourseStudents() throws IOException
    {
        
        //Input parameter courseID
        CourseID in_courseID;
        edma_terminal.put("Enter input parameter courseID : CourseID\n");
        in_courseID = CourseID.fromTerminal(edma_terminal);
        
        //Make the call
        GetCourseStudentsResult res = edma_dm.getCourseStudents(in_courseID);
        
        //Print the result
        edma_terminal.put("\n\nResult: " + res.errorCode() + " - " + res.errorMessage() + "\n");
        if(res.errorDescription() != null)
        {
            edma_terminal.put("Extra info: " + res.errorDescription() + "\n");
        }
        edma_terminal.put("\nOutput parameter studentList:\n");
        edma_terminal.put("  " + res.getStudentList() + "\n");
        edma_terminal.put("Press return to continue!\n");
        readInputLine();
    }

    /**
     * Calls the method: getCourseTeacher
     */
    private void callGetCourseTeacher() throws IOException
    {
        
        //Input parameter courseID
        CourseID in_courseID;
        edma_terminal.put("Enter input parameter courseID : CourseID\n");
        in_courseID = CourseID.fromTerminal(edma_terminal);
        
        //Make the call
        GetCourseTeacherResult res = edma_dm.getCourseTeacher(in_courseID);
        
        //Print the result
        edma_terminal.put("\n\nResult: " + res.errorCode() + " - " + res.errorMessage() + "\n");
        if(res.errorDescription() != null)
        {
            edma_terminal.put("Extra info: " + res.errorDescription() + "\n");
        }
        edma_terminal.put("\nOutput parameter teacher:\n");
        edma_terminal.put("  " + res.getTeacher() + "\n");
        edma_terminal.put("Press return to continue!\n");
        readInputLine();
    }
}
