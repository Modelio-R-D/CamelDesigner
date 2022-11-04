/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
    @objid ("25cdb5e3-5c4f-4f1b-a8d2-b1f0edaf05c9")
    public static final String STEREOTYPE_NAME = "Window";

    @objid ("d2089db3-be36-4778-9420-9ae265318bb1")
    public static final String MEASUREMENTSIZE_TAGTYPE = "measurementSize";

    @objid ("7facefdc-68f2-42dc-97ac-d03610dfaf83")
    public static final String SIZETYPE_TAGTYPE = "sizeType";

    @objid ("08b83eb9-2538-4b4c-bbac-1cd2777568c0")
    public static final String TIMESIZE_TAGTYPE = "timeSize";

    @objid ("793a41bb-b01c-481f-aa03-8b368d6341a0")
    public static final String WINDOWTYPE_TAGTYPE = "windowType";

    /**
     * Tells whether a {@link Window proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Window >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2ae6a2a0-30c5-44a8-9e5d-37b1689ecf50")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Window.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Window >> then instantiate a {@link Window} proxy.
     * 
     * @return a {@link Window} proxy on the created {@link Class}.
     */
    @objid ("9c6b9ccc-1097-4864-9277-51b2366b89f0")
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
    @objid ("55317523-56b5-46d5-bcd8-9527147dc0cb")
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
    @objid ("55f25b83-5583-418e-9095-5036fa57373a")
    public static Window safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Window.canInstantiate(obj))
        	return new Window(obj);
        else
        	throw new IllegalArgumentException("Window: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ed0bf0a2-5b13-442e-9db1-f5fbd9cd5f19")
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
    @objid ("79827b44-0887-45ef-9b05-13f9b35edef2")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'measurementSize'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6572b6a3-7396-43a8-bfe3-054948b5d191")
    public String getMeasurementSize() {
        return this.elt.getTagValue(Window.MdaTypes.MEASUREMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'sizeType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ab62bf3c-27bb-4389-bdc0-c3cf70db6f1c")
    public String getSizeType() {
        return this.elt.getTagValue(Window.MdaTypes.SIZETYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'timeSize'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ce7dc16d-7bac-4eb1-b850-a65819580bd1")
    public String getTimeSize() {
        return this.elt.getTagValue(Window.MdaTypes.TIMESIZE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1cc9ce29-5b5e-4a5e-a2a5-2391fb28cc6f")
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
    @objid ("7b7f22cd-3073-4ad2-9f3b-f681cad876a5")
    public String getWindowType() {
        return this.elt.getTagValue(Window.MdaTypes.WINDOWTYPE_TAGTYPE_ELT);
    }

    @objid ("6557d888-718b-42b1-923c-6849433b3957")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'measurementSize'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dfffb674-746f-4b1c-9ac5-3ffaaf500de1")
    public void setMeasurementSize(final String value) {
        this.elt.putTagValue(Window.MdaTypes.MEASUREMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'sizeType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("44085fd5-b714-407e-a382-8c698a23e0dc")
    public void setSizeType(final String value) {
        this.elt.putTagValue(Window.MdaTypes.SIZETYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'timeSize'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6fcccc40-9d45-4041-abb5-a984964fb4c0")
    public void setTimeSize(final String value) {
        this.elt.putTagValue(Window.MdaTypes.TIMESIZE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("14a2deea-ef9c-4224-9c10-6fde17404616")
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
    @objid ("1057a9de-7074-4ef5-a0ea-69c7197e43f2")
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

    @objid ("da7a73c9-5aed-4278-9184-f2d1c6233779")
    protected Window(final Class elt) {
        super(elt);
    }

    @objid ("0f238069-a54e-4f1f-ae34-e69145b5ddda")
    public static final class MdaTypes {
        @objid ("50d946f5-aa1e-49b2-baa8-2cd103f00d3d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bbcbb701-67f8-411e-8e49-5b133ba4427e")
        public static TagType WINDOWTYPE_TAGTYPE_ELT;

        @objid ("e9cb8abc-7545-4c9a-990a-a6a426f75a95")
        public static TagType SIZETYPE_TAGTYPE_ELT;

        @objid ("9a687b7a-2401-438a-bacf-380a0dcec537")
        public static TagType MEASUREMENTSIZE_TAGTYPE_ELT;

        @objid ("2f91111c-f9b6-4359-b3a8-43de5920e02f")
        public static TagType TIMESIZE_TAGTYPE_ELT;

        @objid ("91772ffe-9262-424f-892f-b8669e17e55e")
        private static Stereotype MDAASSOCDEP;

        @objid ("13027df8-bf66-4916-be5d-526c3888cbdd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("368334b9-da33-4ef5-af99-ec1d48d9f4a4")
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
