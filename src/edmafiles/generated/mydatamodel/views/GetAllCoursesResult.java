package edmafiles.generated.mydatamodel.views;

import edmafiles.generated.valuedomains.mydatamodel.CourseList;
import org.abstractica.edma.runtime.intf.IResult;

/**
 * Access to the result of the method: getAllCourses
 */
public interface GetAllCoursesResult extends IResult
{

    /**
     * Returns the output courseList:CourseList
     * @return  The output courseList:CourseList
     */
    public CourseList getCourseList();

}
