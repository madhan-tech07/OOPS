public class WrapperClassDemo {
    public static void main(String[] args) {
        // Primitive declarations
        int primitiveInt = 100;
        float primitiveFloat = 25.75f;
        char primitiveChar = 'A';
        boolean primitiveBoolean = true;

        // Autoboxing (Primitive -> Wrapper Object)
        Integer wrappedInt = primitiveInt;
        Float wrappedFloat = primitiveFloat;    
        Character wrappedChar = primitiveChar;
        Boolean wrappedBoolean = primitiveBoolean;

        System.out.println("Autoboxed Integer: " + wrappedInt);
        System.out.println("Autoboxed Float: " + wrappedFloat);
        System.out.println("Autoboxed Character: " + wrappedChar); 
        System.out.println("Autoboxed Boolean: " + wrappedBoolean);

        // Unboxing (Wrapper Object -> Primitive)
        int unboxedInt = wrappedInt;                     
        float unboxedFloat = wrappedFloat;              
        char unboxedChar = wrappedChar; 
        boolean unboxedBoolean = wrappedBoolean; 

        System.out.println("Unboxed int: " + unboxedInt);
        System.out.println("Unboxed float: " + unboxedFloat);
        System.out.println("Unboxed char: " + unboxedChar);
        System.out.println("Unboxed boolean: " + unboxedBoolean);

        // Parsing Strings to Wrappers
        String intString = "300";
        Integer parsedInt = Integer.valueOf(intString); 

        String floatString = "75.25";
        Float parsedFloat = Float.valueOf(floatString);

        String charString = "C";
        Character parsedChar = charString.charAt(0);                    

        String booleanString = "true";
        Boolean parsedBoolean = Boolean.valueOf(booleanString);

        System.out.println("Parsed and autoboxed Integer: " + parsedInt);
        System.out.println("Parsed and autoboxed Float: " + parsedFloat); 
        System.out.println("Parsed and autoboxed Character: " + parsedChar);
        System.out.println("Parsed and autoboxed Boolean: " + parsedBoolean);
    }
}