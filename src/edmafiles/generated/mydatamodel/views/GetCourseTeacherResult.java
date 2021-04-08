package edmafiles.generated.mydatamodel.views;

import edmafiles.generated.valuedomains.mydatamodel.Teacher;
import org.abstractica.edma.runtime.intf.IResult;

/**
 * Access to the result of the method: getCourseTeacher
 */
public interface GetCourseTeacherResult extends IResult
{

    /**
     * Returns the output teacher:Teacher
     * @return  The output teacher:Teacher
     */
    public Teacher getTeacher();

}
