package edmafiles.generated.mydatamodel;

import edmafiles.generated.mydatamodel.MyDataModelViewer;
import edmafiles.generated.mydatamodel.kinds.course.CourseUpdater;
import edmafiles.generated.mydatamodel.kinds.course.CourseViewer;
import edmafiles.generated.mydatamodel.kinds.person.PersonUpdater;
import edmafiles.generated.mydatamodel.kinds.person.PersonViewer;
import edmafiles.generated.mydatamodel.kinds.teacher.TeacherUpdater;
import edmafiles.generated.mydatamodel.kinds.teacher.TeacherViewer;
import edmafiles.generated.valuedomains.Email;
import edmafiles.generated.valuedomains.Name;
import edmafiles.generated.valuedomains.mydatamodel.Course;
import edmafiles.generated.valuedomains.mydatamodel.Person;
import edmafiles.generated.valuedomains.mydatamodel.Teacher;
import org.abstractica.edma.runtime.intf.exceptions.UniqueException;

/**
 * This is the updating interface for the MyDataModel data model.
 */
public interface MyDataModelUpdater extends MyDataModelViewer
{

    /**
     * Starts creation of a new Person entity.
     * @return  Builder interface to set the firstName attribute.
     */
    public PersonBuilderFirstName newPerson();

    /**
     * Starts creation of a new Person entity.
     * @param ID  ID of the entity
     * @return    Builder interface to set the firstName attribute.
     */
    public PersonBuilderFirstName newPerson(Long ID);

    /**
     * Creates a new Person from a value in the value domain Person
     * @param person  The value for the new Person.
     * @return        The newly created Person
     * @throws        Throws a UniqueException, if the new entity violates any
     *                of the unique indexes for this kind.
     */
    public PersonUpdater newPerson(Person person) throws UniqueException;

    /**
     * Deletes an entity of kind Person
     * @param person  The Person to be deleted. All extensions to this entity
     *                will also be deleted.
     * @return        <tt>true</tt> if the entity existed and was deleted
     */
    public boolean delete(PersonViewer person);

    /**
     * Updates an entity of kind: Person
     * @param person  The entity to update
     * @return        The updater interface for the entities of kind: Person
     */
    public PersonUpdater update(PersonViewer person);

    /**
     * Starts creation of a new Teacher entity.
     * @param person  The base entity
     * @return        The created Teacher entity
     */
    public TeacherUpdater newTeacher(PersonViewer person);

    /**
     * Creates a new Teacher from a value in the value domain Teacher
     * @param person   The Person to extend.
     * @param teacher  The value for the new Teacher.
     * @return         The newly created Teacher
     */
    public TeacherUpdater newTeacher(PersonViewer person, Teacher teacher);

    /**
     * Deletes an entity of kind Teacher
     * @param teacher  The Teacher to be deleted. All extensions to this entity
     *                 will also be deleted.
     * @return         <tt>true</tt> if the entity existed and was deleted
     */
    public boolean delete(TeacherViewer teacher);

    /**
     * Updates an entity of kind: Teacher
     * @param teacher  The entity to update
     * @return         The updater interface for the entities of kind: Teacher
     */
    public TeacherUpdater update(TeacherViewer teacher);

    /**
     * Starts creation of a new Course entity.
     * @return  Builder interface to set the name attribute.
     */
    public CourseBuilderName newCourse();

    /**
     * Starts creation of a new Course entity.
     * @param ID  ID of the entity
     * @return    Builder interface to set the name attribute.
     */
    public CourseBuilderName newCourse(Long ID);

    /**
     * Creates a new Course from a value in the value domain Course
     * @param course  The value for the new Course.
     * @return        The newly created Course
     * @throws        Throws a UniqueException, if the new entity violates any
     *                of the unique indexes for this kind.
     */
    public CourseUpdater newCourse(Course course) throws UniqueException;

    /**
     * Deletes an entity of kind Course
     * @param course  The Course to be deleted. All extensions to this entity
     *                will also be deleted.
     * @return        <tt>true</tt> if the entity existed and was deleted
     */
    public boolean delete(CourseViewer course);

    /**
     * Updates an entity of kind: Course
     * @param course  The entity to update
     * @return        The updater interface for the entities of kind: Course
     */
    public CourseUpdater update(CourseViewer course);

    /**
     * Builder interface for setting the firstName attribute
     */
    public interface PersonBuilderFirstName
    {

        /**
         * sets the firstName attribute.
         * @param firstName  The value to assign to the firstName attribute
         * @return           Builder interface for setting the lastName
         *                   attribute
         */
        public PersonBuilderLastName firstName(Name firstName);

    }

    /**
     * Builder interface for setting the lastName attribute
     */
    public interface PersonBuilderLastName
    {

        /**
         * sets the lastName attribute.
         * @param lastName  The value to assign to the lastName attribute
         * @return          Builder interface for setting the email attribute
         */
        public PersonBuilderEmail lastName(Name lastName);

    }

    /**
     * Builder interface for setting the email attribute
     */
    public interface PersonBuilderEmail
    {

        /**
         * sets the email attribute.
         * @param email  The value to assign to the email attribute
         * @return       The id of the created Person entity
         */
        public PersonUpdater email(Email email) throws UniqueException;

    }

    /**
     * Builder interface for setting the name attribute
     */
    public interface CourseBuilderName
    {

        /**
         * sets the name attribute.
         * @param name  The value to assign to the name attribute
         * @return      The id of the created Course entity
         */
        public CourseUpdater name(Name name) throws UniqueException;

    }

}
