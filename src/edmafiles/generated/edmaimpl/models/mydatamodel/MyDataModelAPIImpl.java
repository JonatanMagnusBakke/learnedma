package edmafiles.generated.edmaimpl.models.mydatamodel;

import edmafiles.generated.edmaimpl.models.mydatamodel.actions.EDMA_AssignStudentToCourse;
import edmafiles.generated.edmaimpl.models.mydatamodel.actions.EDMA_AssignTeacherToCourse;
import edmafiles.generated.edmaimpl.models.mydatamodel.actions.EDMA_CreateCourse;
import edmafiles.generated.edmaimpl.models.mydatamodel.actions.EDMA_CreatePerson;
import edmafiles.generated.edmaimpl.models.mydatamodel.actions.EDMA_CreateTeacher;
import edmafiles.generated.edmaimpl.models.mydatamodel.views.EDMA_GetAllCourses;
import edmafiles.generated.edmaimpl.models.mydatamodel.views.EDMA_GetAllPersons;
import edmafiles.generated.edmaimpl.models.mydatamodel.views.EDMA_GetCourseStudents;
import edmafiles.generated.edmaimpl.models.mydatamodel.views.EDMA_GetCourseTeacher;
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
import edmafiles.usercode.models.mydatamodel.actions.AssignStudentToCourseUserImpl;
import edmafiles.usercode.models.mydatamodel.actions.AssignTeacherToCourseUserImpl;
import edmafiles.usercode.models.mydatamodel.actions.CreateCourseUserImpl;
import edmafiles.usercode.models.mydatamodel.actions.CreatePersonUserImpl;
import edmafiles.usercode.models.mydatamodel.actions.CreateTeacherUserImpl;
import edmafiles.usercode.models.mydatamodel.views.GetAllCoursesUserImpl;
import edmafiles.usercode.models.mydatamodel.views.GetAllPersonsUserImpl;
import edmafiles.usercode.models.mydatamodel.views.GetCourseStudentsUserImpl;
import edmafiles.usercode.models.mydatamodel.views.GetCourseTeacherUserImpl;
import java.io.IOException;
import org.abstractica.edma.runtime.intf.IDataModelInstance;

/**
 * 
 */
public class MyDataModelAPIImpl implements MyDataModel
{
    private IDataModelInstance edma_dmi;



    /**
     * Constructor
     * @param edma_dmi  Data model instance runtime interface
     */
    public MyDataModelAPIImpl(IDataModelInstance edma_dmi)
    {
        this.edma_dmi = edma_dmi;
    }

    /**
     * Access to the internal data model instance
     * @return  The internal data model instance
     */
    public IDataModelInstance edma_getDMI()
    {
        return edma_dmi;
    }

    /**
     * View all Persons
     * @return  
     */
    public GetAllPersonsResult getAllPersons() throws IOException
    {
        GetAllPersonsUserImpl edma_userMethod = new GetAllPersonsUserImpl();
        EDMA_GetAllPersons edma_method = new EDMA_GetAllPersons(edma_userMethod);
        edma_dmi.execute(edma_method);
        return edma_method.getUserMethod();
    }

    /**
     * View all Courses
     * @return  
     */
    public GetAllCoursesResult getAllCourses() throws IOException
    {
        GetAllCoursesUserImpl edma_userMethod = new GetAllCoursesUserImpl();
        EDMA_GetAllCourses edma_method = new EDMA_GetAllCourses(edma_userMethod);
        edma_dmi.execute(edma_method);
        return edma_method.getUserMethod();
    }

    /**
     * View all Students on Course
     * @param courseID  Input parameter courseID
     * @return          
     */
    public GetCourseStudentsResult getCourseStudents(CourseID courseID) throws IOException
    {
        if(courseID == null)
        {
            throw new NullPointerException("courseID may not be null");
        }
        GetCourseStudentsUserImpl edma_userMethod = new GetCourseStudentsUserImpl(courseID);
        EDMA_GetCourseStudents edma_method = new EDMA_GetCourseStudents(edma_userMethod);
        edma_dmi.execute(edma_method);
        return edma_method.getUserMethod();
    }

    /**
     * View Teacher for Course
     * @param courseID  Input parameter courseID
     * @return          
     */
    public GetCourseTeacherResult getCourseTeacher(CourseID courseID) throws IOException
    {
        if(courseID == null)
        {
            throw new NullPointerException("courseID may not be null");
        }
        GetCourseTeacherUserImpl edma_userMethod = new GetCourseTeacherUserImpl(courseID);
        EDMA_GetCourseTeacher edma_method = new EDMA_GetCourseTeacher(edma_userMethod);
        edma_dmi.execute(edma_method);
        return edma_method.getUserMethod();
    }

    /**
     * Creates a new person
     * @param firstName  Input parameter firstName
     * @param lastName   Input parameter lastName
     * @param email      Input parameter email
     * @return           
     */
    public CreatePersonResult createPerson(Name firstName, Name lastName, Email email) throws IOException
    {
        if(firstName == null)
        {
            throw new NullPointerException("firstName may not be null");
        }
        if(lastName == null)
        {
            throw new NullPointerException("lastName may not be null");
        }
        if(email == null)
        {
            throw new NullPointerException("email may not be null");
        }
        CreatePersonUserImpl edma_userMethod = new CreatePersonUserImpl(firstName, lastName, email);
        EDMA_CreatePerson edma_method = new EDMA_CreatePerson(edma_userMethod);
        edma_dmi.execute(edma_method);
        return edma_method.getUserMethod();
    }

    /**
     * Creates a new teacher
     * @param firstName  Input parameter firstName
     * @param lastName   Input parameter lastName
     * @param email      Input parameter email
     * @return           
     */
    public CreateTeacherResult createTeacher(Name firstName, Name lastName, Email email) throws IOException
    {
        if(firstName == null)
        {
            throw new NullPointerException("firstName may not be null");
        }
        if(lastName == null)
        {
            throw new NullPointerException("lastName may not be null");
        }
        if(email == null)
        {
            throw new NullPointerException("email may not be null");
        }
        CreateTeacherUserImpl edma_userMethod = new CreateTeacherUserImpl(firstName, lastName, email);
        EDMA_CreateTeacher edma_method = new EDMA_CreateTeacher(edma_userMethod);
        edma_dmi.execute(edma_method);
        return edma_method.getUserMethod();
    }

    /**
     * Creates a new course
     * @param name  Input parameter name
     * @return      
     */
    public CreateCourseResult createCourse(Name name) throws IOException
    {
        if(name == null)
        {
            throw new NullPointerException("name may not be null");
        }
        CreateCourseUserImpl edma_userMethod = new CreateCourseUserImpl(name);
        EDMA_CreateCourse edma_method = new EDMA_CreateCourse(edma_userMethod);
        edma_dmi.execute(edma_method);
        return edma_method.getUserMethod();
    }

    /**
     * Assigns a Student to a Course
     * @param studentID  Input parameter studentID
     * @param courseID   Input parameter courseID
     * @return           
     */
    public AssignStudentToCourseResult assignStudentToCourse(PersonID studentID, CourseID courseID) throws IOException
    {
        if(studentID == null)
        {
            throw new NullPointerException("studentID may not be null");
        }
        if(courseID == null)
        {
            throw new NullPointerException("courseID may not be null");
        }
        AssignStudentToCourseUserImpl edma_userMethod = new AssignStudentToCourseUserImpl(studentID, courseID);
        EDMA_AssignStudentToCourse edma_method = new EDMA_AssignStudentToCourse(edma_userMethod);
        edma_dmi.execute(edma_method);
        return edma_method.getUserMethod();
    }

    /**
     * Assigns the Teacher for the Course
     * @param teacherID  Input parameter teacherID
     * @param courseID   Input parameter courseID
     * @return           
     */
    public AssignTeacherToCourseResult assignTeacherToCourse(TeacherID teacherID, CourseID courseID) throws IOException
    {
        if(teacherID == null)
        {
            throw new NullPointerException("teacherID may not be null");
        }
        if(courseID == null)
        {
            throw new NullPointerException("courseID may not be null");
        }
        AssignTeacherToCourseUserImpl edma_userMethod = new AssignTeacherToCourseUserImpl(teacherID, courseID);
        EDMA_AssignTeacherToCourse edma_method = new EDMA_AssignTeacherToCourse(edma_userMethod);
        edma_dmi.execute(edma_method);
        return edma_method.getUserMethod();
    }
}
