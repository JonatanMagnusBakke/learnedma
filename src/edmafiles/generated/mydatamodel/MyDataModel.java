package edmafiles.generated.mydatamodel;

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

/**
 * The external interface for the model: MyDataModel
 */
public interface MyDataModel
{

    /**
     * View all Persons
     * @return  
     */
    public GetAllPersonsResult getAllPersons() throws IOException;

    /**
     * View all Courses
     * @return  
     */
    public GetAllCoursesResult getAllCourses() throws IOException;

    /**
     * View all Students on Course
     * @param courseID  Input parameter courseID
     * @return          
     */
    public GetCourseStudentsResult getCourseStudents(CourseID courseID) throws IOException;

    /**
     * View Teacher for Course
     * @param courseID  Input parameter courseID
     * @return          
     */
    public GetCourseTeacherResult getCourseTeacher(CourseID courseID) throws IOException;

    /**
     * Creates a new person
     * @param firstName  Input parameter firstName
     * @param lastName   Input parameter lastName
     * @param email      Input parameter email
     * @return           
     */
    public CreatePersonResult createPerson(Name firstName, Name lastName, Email email) throws IOException;

    /**
     * Creates a new teacher
     * @param firstName  Input parameter firstName
     * @param lastName   Input parameter lastName
     * @param email      Input parameter email
     * @return           
     */
    public CreateTeacherResult createTeacher(Name firstName, Name lastName, Email email) throws IOException;

    /**
     * Creates a new course
     * @param name  Input parameter name
     * @return      
     */
    public CreateCourseResult createCourse(Name name) throws IOException;

    /**
     * Assigns a Student to a Course
     * @param studentID  Input parameter studentID
     * @param courseID   Input parameter courseID
     * @return           
     */
    public AssignStudentToCourseResult assignStudentToCourse(PersonID studentID, CourseID courseID) throws IOException;

    /**
     * Assigns the Teacher for the Course
     * @param teacherID  Input parameter teacherID
     * @param courseID   Input parameter courseID
     * @return           
     */
    public AssignTeacherToCourseResult assignTeacherToCourse(TeacherID teacherID, CourseID courseID) throws IOException;

}
