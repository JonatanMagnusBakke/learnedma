package edmafiles.usercode.models.mydatamodel.views;

import edmafiles.generated.mydatamodel.MyDataModelViewer;
import edmafiles.generated.mydatamodel.kinds.course.CourseViewer;
import edmafiles.generated.mydatamodel.kinds.teacher.TeacherViewer;
import edmafiles.generated.mydatamodel.views.GetCourseTeacherResult;
import edmafiles.generated.valuedomains.mydatamodel.CourseID;
import edmafiles.generated.valuedomains.mydatamodel.Teacher;
import org.abstractica.edma.runtime.implementations.common.Result;

/**
 * 
 */
public class GetCourseTeacherUserImpl extends Result implements GetCourseTeacherResult
{
    private static final int OK = 0;
    private static final int COURSE_DOES_NOT_EXIST = 1;
    private static final int NOT_TEACHER_FOR_COURSE = 2;
    private final CourseID in_courseID;
    private Teacher out_teacher;



    /**
     * Constructor
     * @param in_courseID  Input parameter 1
     */
    public GetCourseTeacherUserImpl(CourseID in_courseID)
    {
        this.in_courseID = in_courseID;
        out_teacher = null;
    }

    /**
     * Execution of the view
     * @param view  View interface
     * @return      Return 0 if succesful or one of the error codes if not
     */
    public int execute(MyDataModelViewer view)
    {
        // Implementation of getCourseTeacher
        // Return one of the following error codes:
        // OK
        // COURSE_DOES_NOT_EXIST
        // NOT_TEACHER_FOR_COURSE
        
        // If an error needs extra explanation, use: setErrorDescription("Extra info");
        
        // WARNING : Any code outside the following begin and end tags
        // will be lost when re-generation occurs.
        
        // EDMA_non-generated_code_begin
        CourseViewer course = view.getCourseKind().getFromID(in_courseID);
        if(course == null)
        {
            return COURSE_DOES_NOT_EXIST;
        }
        TeacherViewer teacher = course.getTeacher();
        if(teacher != null)
        {
            out_teacher = teacher.snapshot();
        }
        return OK;
        
        // EDMA_non-generated_code_end
    }

    /**
     * Returns the output teacher:Teacher
     * @return  The output teacher:Teacher
     */
    public Teacher getTeacher()
    {
        if(errorCode() != 0) return null;
        return out_teacher;
    }
}
