/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

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
 * Proxy class to handle a {@link Class} with << Timer >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("8cafa6ee-69cd-4fb1-a69e-ae3b71f7dd61")
public class Timer extends FeatureClass {
    @objid ("fccdaa97-6533-4243-8515-60b40bc56de2")
    public static final String STEREOTYPE_NAME = "Timer";

    @objid ("0586cb6f-e83a-4fe7-8682-d881dc2106c7")
    public static final String MAXOCCURRENCENUM_TAGTYPE = "maxOccurrenceNum";

    @objid ("712cbbf3-0bce-492c-85c7-fa79ddd80fc9")
    public static final String TIMEVALUE_TAGTYPE = "timeValue";

    @objid ("ed21c5be-0098-4702-80cc-5a5ee54c57fc")
    public static final String TYPE_TAGTYPE = "type";

    /**
     * Tells whether a {@link Timer proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Timer >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e8c545e7-8893-4b92-a1b7-6bd8555d9d2b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Timer.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Timer >> then instantiate a {@link Timer} proxy.
     * 
     * @return a {@link Timer} proxy on the created {@link Class}.
     */
    @objid ("32a478f0-9176-4fbb-b3f9-ae4cc09746b3")
    public static Timer create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Timer.STEREOTYPE_NAME);
        return Timer.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Timer} proxy from a {@link Class} stereotyped << Timer >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Timer} proxy or <i>null</i>.
     */
    @objid ("0198202d-21f6-4353-b252-43de9c6ce73d")
    public static Timer instantiate(final Class obj) {
        return Timer.canInstantiate(obj) ? new Timer(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Timer} proxy from a {@link Class} stereotyped << Timer >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Timer} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2f6270ab-e15d-487c-9248-5c11b9bfacb1")
    public static Timer safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Timer.canInstantiate(obj))
        	return new Timer(obj);
        else
        	throw new IllegalArgumentException("Timer: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f2a0a4dc-5a2d-40f4-b937-948e27461f69")
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
        Timer other = (Timer) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("8148deb5-c337-4a21-aedd-ea8cecfc4d08")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'maxOccurrenceNum'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1743e8b7-dc67-4e23-8096-3ddb06ed72d6")
    public String getMaxOccurrenceNum() {
        return this.elt.getTagValue(Timer.MdaTypes.MAXOCCURRENCENUM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'timeValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("64076d90-401e-47b5-a120-9c1f31042381")
    public String getTimeValue() {
        return this.elt.getTagValue(Timer.MdaTypes.TIMEVALUE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c9cea597-178b-4c55-b911-d58d63b6cc7f")
    public String getType() {
        return this.elt.getTagValue(Timer.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("01cde427-e45a-453f-8e9b-30d2ee0e2e9f")
    public Unit getUnit() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Timer.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Timer.MdaTypes.MDAASSOCDEP_ROLE), "unit")){
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

    @objid ("da04d281-d89d-4733-96d5-46217ccc5ed6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'maxOccurrenceNum'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("537c7f9c-e8a8-4077-8da3-1e2af4453f55")
    public void setMaxOccurrenceNum(final String value) {
        this.elt.putTagValue(Timer.MdaTypes.MAXOCCURRENCENUM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'timeValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("25957bfc-dc38-47ce-a5cc-fde6997cecbb")
    public void setTimeValue(final String value) {
        this.elt.putTagValue(Timer.MdaTypes.TIMEVALUE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e4886990-987c-410c-9c45-d17f3262dea7")
    public void setType(final String value) {
        this.elt.putTagValue(Timer.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("47b73a84-ab45-4aa6-9b4d-88878c6d1ce6")
    public void setUnit(final Unit obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Timer.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Timer.MdaTypes.MDAASSOCDEP_ROLE), "unit")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Timer.MdaTypes.MDAASSOCDEP);
              dep.setName("unit");      dep.putTagValue(Timer.MdaTypes.MDAASSOCDEP_ROLE, "unit");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("15f73c69-1e3a-4b5a-b451-c937c69e6578")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("c8297f54-dcca-4ff1-a902-6091568707b9")
    protected Timer(final Class elt) {
        super(elt);
    }

    @objid ("93fa2506-690b-41f3-a6df-8e0ad6afab5e")
    public static final class MdaTypes {
        @objid ("bc2d3842-f1bc-48df-aa62-ede0bc62591a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("92ba243c-fc6a-47d9-b55c-462687e89f1b")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("830879b9-c593-4bcb-95d0-9d298b95aff2")
        public static TagType TIMEVALUE_TAGTYPE_ELT;

        @objid ("68832b92-438b-4d66-8747-5ac6757530b9")
        public static TagType MAXOCCURRENCENUM_TAGTYPE_ELT;

        @objid ("54c3fcfa-7e47-4999-8dd5-bf7153151692")
        private static Stereotype MDAASSOCDEP;

        @objid ("47c32537-96de-4bc5-96ec-28c8a2df4d6a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b6cd387d-77a8-4abb-9dc3-1398c775501c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ee279c12-3256-430d-b3f9-146318d3e947");
            TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1442a037-e5a4-4248-bc4d-20d6cc5568e0");
            TIMEVALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4898fefb-c185-478e-b8cf-96025bfe5971");
            MAXOCCURRENCENUM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "94fa8f95-4a9e-4209-b10c-b8c31176f9af");
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
