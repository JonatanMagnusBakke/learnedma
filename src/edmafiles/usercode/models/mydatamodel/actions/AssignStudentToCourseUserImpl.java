package edmafiles.usercode.models.mydatamodel.actions;

import edmafiles.generated.mydatamodel.MyDataModelUpdater;
import edmafiles.generated.mydatamodel.actions.AssignStudentToCourseResult;
import edmafiles.generated.mydatamodel.kinds.course.CourseUpdater;
import edmafiles.generated.mydatamodel.kinds.course.CourseViewer;
import edmafiles.generated.mydatamodel.kinds.person.PersonViewer;
import edmafiles.generated.valuedomains.mydatamodel.CourseID;
import edmafiles.generated.valuedomains.mydatamodel.PersonID;
import org.abstractica.edma.runtime.implementations.common.Result;

/**
 * 
 */
public class AssignStudentToCourseUserImpl extends Result implements AssignStudentToCourseResult
{
    private static final int OK = 0;
    private static final int STUDENT_ID_DOES_NOT_EXIST = 1;
    private static final int COURSE_ID_DOES_NOT_EXIST = 2;
    private static final int STUDENT_ALREADY_ASSIGNED_TO_THE_COURSE = 3;
    private final PersonID in_studentID;
    private final CourseID in_courseID;



    /**
     * Constructor
     * @param in_studentID  Input parameter 1
     * @param in_courseID   Input parameter 2
     */
    public AssignStudentToCourseUserImpl(PersonID in_studentID, CourseID in_courseID)
    {
        this.in_studentID = in_studentID;
        this.in_courseID = in_courseID;
    }

    /**
     * Execution of the action
     * @param upd  Update interface
     * @return     Return 0 to commit or one of the error codes to roll back
     */
    public int execute(MyDataModelUpdater upd)
    {
        // Implementation of assignStudentToCourse
        // Return one of the following error codes:
        // OK
        // STUDENT_ID_DOES_NOT_EXIST
        // COURSE_ID_DOES_NOT_EXIST
        // STUDENT_ALREADY_ASSIGNED_TO_THE_COURSE
        
        // If an error needs extra explanation, use: setErrorDescription("Extra info");
        
        // WARNING : Any code outside the following begin and end tags
        // will be lost when re-generation occurs.
        
        // EDMA_non-generated_code_begin
        PersonViewer student = upd.getPersonKind().getFromID(in_studentID);
        if(student == null)
        {
            return STUDENT_ID_DOES_NOT_EXIST;
        }
        CourseViewer course = upd.getCourseKind().getFromID(in_courseID);
        if(course == null)
        {
            return COURSE_ID_DOES_NOT_EXIST;
        }
        if(course.getStudentSet().contains(in_studentID))
        {
            return STUDENT_ALREADY_ASSIGNED_TO_THE_COURSE;
        }
        CourseUpdater courseUpdater = upd.update(course);
        courseUpdater.addStudent(student);
        return OK;
        
        // EDMA_non-generated_code_end
    }
}
