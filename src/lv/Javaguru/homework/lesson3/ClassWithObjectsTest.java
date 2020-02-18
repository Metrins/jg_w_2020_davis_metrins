package lv.Javaguru.homework.lesson3;

//import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

public class ClassWithObjectsTest {
    public static void main(String[] args) {

        ClassWithObjects classWithObjects = new ClassWithObjects();

        printToConsole(classWithObjects);
        fillObjectVariables(classWithObjects);
        printToConsole(classWithObjects);
    }
    public static void printToConsole(ClassWithObjects classWithObjects) {
        System.out.println("Byte is " + classWithObjects.byteVariable);
        System.out.println("Short is " + classWithObjects.shortVariable);
        System.out.println("Integer is " + classWithObjects.integerVariable);
        System.out.println("Long is " + classWithObjects.longVariable);
        System.out.println("Float is " + classWithObjects.floatVariable);
        System.out.println("Double is " + classWithObjects.doubleVariable);
        System.out.println("Character is " + classWithObjects.characterVariable);
        System.out.println("Boolean is " + classWithObjects.booleanVariable);
    }

    public static void fillObjectVariables(ClassWithObjects classWithObjects) {
        classWithObjects.byteVariable = 12;
        classWithObjects.shortVariable = 149;
        classWithObjects.integerVariable = 9998;
        classWithObjects.longVariable = 123456789101112L;
        classWithObjects.floatVariable = 1332.45555f;
        classWithObjects.doubleVariable = 1234567.1234567;
        classWithObjects.characterVariable = 'A';
        classWithObjects.booleanVariable = false;
    }

    }
