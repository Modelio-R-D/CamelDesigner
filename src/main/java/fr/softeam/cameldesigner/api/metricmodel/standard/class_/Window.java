/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << Window >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("8bc634f0-656d-49d2-ba18-28050cd2f9dd")
public class Window extends FeatureClass {
    @objid ("e690235e-c990-46a0-968d-089dfae56435")
    public static final String STEREOTYPE_NAME = "Window";

    @objid ("9ec93c9e-2d8b-495f-9925-ddad7b4e4c47")
    public static final String MEASUREMENTSIZE_TAGTYPE = "measurementSize";

    @objid ("ed8ecc57-ef2b-4ffa-a336-dcf7da74e344")
    public static final String SIZETYPE_TAGTYPE = "sizeType";

    @objid ("b6438629-fb8e-4897-9090-dec15d4acd9c")
    public static final String TIMESIZE_TAGTYPE = "timeSize";

    @objid ("788adcfb-e8c4-4fd9-b89e-e9d6f4874952")
    public static final String WINDOWTYPE_TAGTYPE = "windowType";

    /**
     * Tells whether a {@link Window proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Window >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5c7efd46-95d2-47a2-bc25-ed363d857f65")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Window.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Window >> then instantiate a {@link Window} proxy.
     * 
     * @return a {@link Window} proxy on the created {@link Class}.
     */
    @objid ("8aff1d00-a9f4-4de4-a357-2068c1d07e9d")
    public static Window create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Window.STEREOTYPE_NAME);
        return Window.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Window} proxy from a {@link Class} stereotyped << Window >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Window} proxy or <i>null</i>.
     */
    @objid ("035ec70e-9d56-4d1f-a5bc-7c93448a1395")
    public static Window instantiate(final Class obj) {
        return Window.canInstantiate(obj) ? new Window(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Window} proxy from a {@link Class} stereotyped << Window >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Window} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c7089c9a-70c0-42fc-8a03-f0ba47d756f2")
    public static Window safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Window.canInstantiate(obj))
        	return new Window(obj);
        else
        	throw new IllegalArgumentException("Window: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3b376e42-f061-4884-9431-c55ae78b342b")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Window other = (Window) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b38474ec-4223-405c-a4f6-22f82569d7b6")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'measurementSize'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8a09c188-3e56-4f09-8e97-af1892f1e7e3")
    public String getMeasurementSize() {
        return this.elt.getTagValue(Window.MdaTypes.MEASUREMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'sizeType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1ca4d3bf-3f35-4587-9f7d-10d86bda9b4b")
    public String getSizeType() {
        return this.elt.getTagValue(Window.MdaTypes.SIZETYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'timeSize'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0481d3d6-bd71-4d8f-a1dd-5dd73d3d8ce9")
    public String getTimeSize() {
        return this.elt.getTagValue(Window.MdaTypes.TIMESIZE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2bc62c6e-28b8-4d8a-895e-9e440d02180d")
    public Unit getTimeUnit() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Window.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Window.MdaTypes.MDAASSOCDEP_ROLE), "timeUnit")){
                  if (SingleUnit.canInstantiate(d.getDependsOn()))
                     return (SingleUnit)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SingleUnit.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CompositeUnit.canInstantiate(d.getDependsOn()))
                     return (CompositeUnit)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeUnit.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Dimensionless.canInstantiate(d.getDependsOn()))
                     return (Dimensionless)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Dimensionless.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'windowType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b2b47a39-67e9-4368-a934-ddcf70bfcd27")
    public String getWindowType() {
        return this.elt.getTagValue(Window.MdaTypes.WINDOWTYPE_TAGTYPE_ELT);
    }

    @objid ("61900d89-dff7-4a3c-974f-39bde372c2fd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'measurementSize'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("73e9205d-d914-4a05-9482-951b07872954")
    public void setMeasurementSize(final String value) {
        this.elt.putTagValue(Window.MdaTypes.MEASUREMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'sizeType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("52c1c0c3-a949-42ca-898c-1ce5645a1035")
    public void setSizeType(final String value) {
        this.elt.putTagValue(Window.MdaTypes.SIZETYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'timeSize'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e35db014-590e-4018-a45a-e5d8d2e216df")
    public void setTimeSize(final String value) {
        this.elt.putTagValue(Window.MdaTypes.TIMESIZE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b565e24f-5c19-4afc-a10e-1eacc01cd288")
    public void setTimeUnit(final Unit obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Window.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Window.MdaTypes.MDAASSOCDEP_ROLE), "timeUnit")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Window.MdaTypes.MDAASSOCDEP);
              dep.setName("timeUnit");      dep.putTagValue(Window.MdaTypes.MDAASSOCDEP_ROLE, "timeUnit");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'windowType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e7a8d401-5a4e-4f25-ab76-b7e4927e9d43")
    public void setWindowType(final String value) {
        this.elt.putTagValue(Window.MdaTypes.WINDOWTYPE_TAGTYPE_ELT, value);
    }

    @objid ("d4bc8486-c158-4e8b-a04b-b96dfbfa2206")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("1811f9cc-9573-4d8b-b766-b21e6c4012e6")
    protected Window(final Class elt) {
        super(elt);
    }

    @objid ("0f238069-a54e-4f1f-ae34-e69145b5ddda")
    public static final class MdaTypes {
        @objid ("aac2c36a-b886-40bf-a48e-fa3fb8404793")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8b649af0-0942-47ed-b47a-53b29bd9d8c5")
        public static TagType WINDOWTYPE_TAGTYPE_ELT;

        @objid ("6488457c-d5b9-4c41-bc2f-69e08b0b9f02")
        public static TagType SIZETYPE_TAGTYPE_ELT;

        @objid ("aa0786eb-9f1c-4fb8-8305-dda27832a52b")
        public static TagType MEASUREMENTSIZE_TAGTYPE_ELT;

        @objid ("e3f9ba8c-a8b2-454d-ad5b-7fa2763366ed")
        public static TagType TIMESIZE_TAGTYPE_ELT;

        @objid ("d95bb50b-ef80-42aa-acc1-4d751c36b1c4")
        private static Stereotype MDAASSOCDEP;

        @objid ("63bf6efe-c5d3-4f0f-a977-4066e563b55f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a281183e-b8e9-45de-b3e9-c8b47f52139d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "33bb8dc7-688c-4f64-97da-a3fcddbddc20");
            WINDOWTYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cd7ae4c0-9f79-4384-b562-1bfdfa78754a");
            SIZETYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9c7e3aaf-1ae0-4766-b44d-2717c3abea43");
            MEASUREMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "651305db-6f84-43d4-ba59-fbc3a00368d0");
            TIMESIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7ab2f3bb-742a-4b32-b5f9-08576f164c8b");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(CamelDesignerModule.getInstance() != null) {
			init(CamelDesignerModule.getInstance().getModuleContext());
		}
	}
    }

}
