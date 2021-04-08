package edmafiles.usercode.models.mydatamodel.actions;

import edmafiles.generated.mydatamodel.MyDataModelUpdater;
import edmafiles.generated.mydatamodel.actions.AssignTeacherToCourseResult;
import edmafiles.generated.mydatamodel.kinds.course.CourseUpdater;
import edmafiles.generated.mydatamodel.kinds.course.CourseViewer;
import edmafiles.generated.mydatamodel.kinds.teacher.TeacherViewer;
import edmafiles.generated.valuedomains.mydatamodel.CourseID;
import edmafiles.generated.valuedomains.mydatamodel.TeacherID;
import org.abstractica.edma.runtime.implementations.common.Result;

/**
 * 
 */
public class AssignTeacherToCourseUserImpl extends Result implements AssignTeacherToCourseResult
{
    private static final int OK = 0;
    private static final int TEACHER_ID_DOES_NOT_EXIST = 1;
    private static final int COURSE_ID_DOES_NOT_EXIST = 2;
    private static final int A_TEACHER_IS_ALREADY_ASSIGNED = 3;
    private final TeacherID in_teacherID;
    private final CourseID in_courseID;



    /**
     * Constructor
     * @param in_teacherID  Input parameter 1
     * @param in_courseID   Input parameter 2
     */
    public AssignTeacherToCourseUserImpl(TeacherID in_teacherID, CourseID in_courseID)
    {
        this.in_teacherID = in_teacherID;
        this.in_courseID = in_courseID;
    }

    /**
     * Execution of the action
     * @param upd  Update interface
     * @return     Return 0 to commit or one of the error codes to roll back
     */
    public int execute(MyDataModelUpdater upd)
    {
        // Implementation of assignTeacherToCourse
        // Return one of the following error codes:
        // OK
        // TEACHER_ID_DOES_NOT_EXIST
        // COURSE_ID_DOES_NOT_EXIST
        // A_TEACHER_IS_ALREADY_ASSIGNED
        
        // If an error needs extra explanation, use: setErrorDescription("Extra info");
        
        // WARNING : Any code outside the following begin and end tags
        // will be lost when re-generation occurs.
        
        // EDMA_non-generated_code_begin
        TeacherViewer teacher = upd.getTeacherKind().getFromID(in_teacherID);
        if(teacher == null)
        {
            return TEACHER_ID_DOES_NOT_EXIST;
        }
        CourseViewer course = upd.getCourseKind().getFromID(in_courseID);
        if(course == null)
        {
            return COURSE_ID_DOES_NOT_EXIST;
        }
        CourseUpdater courseUpdater = upd.update(course);
        if(courseUpdater.getTeacher() != null)
        {
            return A_TEACHER_IS_ALREADY_ASSIGNED;
        }
        courseUpdater.setTeacher(teacher);
        return OK;
        
        // EDMA_non-generated_code_end
    }
}
