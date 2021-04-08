package edmafiles.generated.mydatamodel.views;

import edmafiles.generated.valuedomains.mydatamodel.PersonList;
import org.abstractica.edma.runtime.intf.IResult;

/**
 * Access to the result of the method: getCourseStudents
 */
public interface GetCourseStudentsResult extends IResult
{

    /**
     * Returns the output studentList:PersonList
     * @return  The output studentList:PersonList
     */
    public PersonList getStudentList();

}
