package fr.softeam.cameldesigner.utils;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("593c7229-390c-4c61-ae65-36106dc471bb")
public class PrimitiveTypeUtils {
    @objid ("e66c46a0-68ba-4379-bced-77c961b23e1a")
    public static boolean isPrimitiveType(String value) {
        return PrimitiveTypeUtils.getPrimitiveType().contains(value);
    }

    @objid ("76f0ce32-e17e-416b-a532-ab86dba73a62")
    public static boolean isPrimitiveType(GeneralClass value) {
        for( CamelPrimitiveType type : CamelPrimitiveType.values()) {
            if (type.getID().equals(value.getUuid())) {
                return true;
            }
        }
        return false;
    }

    @objid ("79486d68-5c69-4d17-aa80-2b12d4d6936b")
    public static DataType getDataType(String value) {
        String ID = null;
        
        for( CamelPrimitiveType type : CamelPrimitiveType.values()) {
            if (type.toString().equals(value)) {
                return CamelDesignerModule.getInstance().getModuleContext().getModelingSession().findElementById(DataType.class, type.getID());
            }
        }
        return null;
    }

    @objid ("6bbb9ade-0b4f-4a50-8d82-9f765daa9740")
    public static String getLabel(DataType value) {
        for( CamelPrimitiveType type : CamelPrimitiveType.values()) {
            if (type.getID().equals(value.getUuid())) {
                return type.toString();
            }
        }
        return "";
    }

    @objid ("898efe88-fdb4-463f-a809-36a5e893c988")
    public static List<String> getPrimitiveType() {
        List<String> primitiveTypes = new ArrayList<>();
        for (CamelPrimitiveType type : CamelPrimitiveType.values()) {
            primitiveTypes.add(type.name());
        }
        return primitiveTypes;
    }


//    if (self.oclIsTypeOf(IntValue) and v.oclIsTypeOf(IntValue))
//        then self.oclAsType(IntValue).value = v.oclAsType(IntValue).value
//        else if (self.oclIsTypeOf(FloatValue) and v.oclIsTypeOf(FloatValue))
//            then self.oclAsType(FloatValue).value = v.oclAsType(FloatValue).value
//            else if (self.oclIsTypeOf(DoubleValue) and v.oclIsTypeOf(DoubleValue))
//                then self.oclAsType(DoubleValue).value = v.oclAsType(DoubleValue).value
//                else if (self.oclIsTypeOf(StringValue) and v.oclIsTypeOf(StringValue))
//                    then self.oclAsType(StringValue).value = v.oclAsType(StringValue).value
//                    else if (self.oclIsTypeOf(BooleanValue) and v.oclIsTypeOf(BooleanValue))
//                        then self.oclAsType(BooleanValue).value = v.oclAsType(BooleanValue).value
//                        else false
//                        endif
//                    endif
//                endif
//            endif
//        endif
    @objid ("410c2f57-791f-4c67-94df-da3b911ee4b3")
    enum CamelPrimitiveType {
        IntType ("00000004-0000-0009-0000-000000000000"),
        StringType ("00000004-0000-000d-0000-000000000000"),
        BooleanType ("00000004-0000-0005-0000-000000000000"),
        FloatType ("00000004-0000-000b-0000-000000000000"),
        DoubleType ("00000004-0000-0010-0000-000000000000");

        @objid ("f514bb7c-c8a3-4fb2-8737-9a396de018eb")
        private String _UUID = null;

        @objid ("42cc6b3c-d21f-4311-959c-79235afe6e21")
        private CamelPrimitiveType(String uuid) {
            this._UUID = uuid;
        }

        @objid ("123741ed-d614-4632-ac92-cef9a05cb55e")
        public String getID() {
            return this._UUID;
        }

    }

}
