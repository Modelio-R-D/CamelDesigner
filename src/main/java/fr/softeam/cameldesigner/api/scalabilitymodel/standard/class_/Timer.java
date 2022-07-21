/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("785511be-102f-49f5-87b2-dd9384fe2090")
    public static final String STEREOTYPE_NAME = "Timer";

    @objid ("e4c4dbed-f24f-473b-ae32-4cd3a95ecae7")
    public static final String MAXOCCURRENCENUM_TAGTYPE = "maxOccurrenceNum";

    @objid ("174ec0b6-8005-4144-a903-ebe883abd6a4")
    public static final String TIMEVALUE_TAGTYPE = "timeValue";

    @objid ("b5db8679-1bbe-4ca6-9349-10dd0bae9d3b")
    public static final String TYPE_TAGTYPE = "type";

    /**
     * Tells whether a {@link Timer proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Timer >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("996fa4f5-37f1-46ac-8765-94f2971b4845")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Timer.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Timer >> then instantiate a {@link Timer} proxy.
     * 
     * @return a {@link Timer} proxy on the created {@link Class}.
     */
    @objid ("ea57fe79-745b-4567-b483-77f8eb7adedc")
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
    @objid ("b00a6de0-146b-49d0-93a2-c3e41760a4de")
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
    @objid ("97442ccf-e683-4613-a8c5-6d16a47e16b1")
    public static Timer safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Timer.canInstantiate(obj))
        	return new Timer(obj);
        else
        	throw new IllegalArgumentException("Timer: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d44e6b09-df95-4c3e-a972-baf703d1f489")
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
    @objid ("903e419b-e19e-4915-a90f-218f7251ffab")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'maxOccurrenceNum'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2c254431-2d50-449f-afe3-d71a5d7fc903")
    public String getMaxOccurrenceNum() {
        return this.elt.getTagValue(Timer.MdaTypes.MAXOCCURRENCENUM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'timeValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dbe78f7e-1dde-45d1-83f0-100db8529e2b")
    public String getTimeValue() {
        return this.elt.getTagValue(Timer.MdaTypes.TIMEVALUE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("12801d41-367c-46aa-9b8c-40719bd2cede")
    public String getType() {
        return this.elt.getTagValue(Timer.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3fc4a8a4-c987-4395-a99e-7e8bed457c05")
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

    @objid ("86ba3e2a-d120-44fb-b21f-c1ad1fa89fe9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'maxOccurrenceNum'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("516450d3-a891-47f3-949d-65f397bb1f82")
    public void setMaxOccurrenceNum(final String value) {
        this.elt.putTagValue(Timer.MdaTypes.MAXOCCURRENCENUM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'timeValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1960de60-3c4b-4034-b6bc-54d085cb55c9")
    public void setTimeValue(final String value) {
        this.elt.putTagValue(Timer.MdaTypes.TIMEVALUE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b3708ed7-690b-43f7-a28d-0cfcad6b08d9")
    public void setType(final String value) {
        this.elt.putTagValue(Timer.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("133cd93f-08ee-4a4e-9a2b-844fdb70a633")
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

    @objid ("4587a333-5e3a-4ed1-b500-35377ea2a378")
    protected Timer(final Class elt) {
        super(elt);
    }

    @objid ("93fa2506-690b-41f3-a6df-8e0ad6afab5e")
    public static final class MdaTypes {
        @objid ("af44b8ab-00f5-4416-b234-98b41e3c3fc6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a0b5ca20-535d-4c33-afc1-fa7a071eacd9")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("42e11f9c-8535-47ce-a531-d596a6c22cf9")
        public static TagType TIMEVALUE_TAGTYPE_ELT;

        @objid ("3c63fb2e-fe24-446f-8031-8d2a6d7b12c5")
        public static TagType MAXOCCURRENCENUM_TAGTYPE_ELT;

        @objid ("1e9169bc-db67-4b8c-89ed-4fabe004f0ad")
        private static Stereotype MDAASSOCDEP;

        @objid ("12d4ceb5-9964-40c8-96e6-b26a47d53ace")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1fc73cb3-2e7c-4c9e-be4c-b77513b0ae86")
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
