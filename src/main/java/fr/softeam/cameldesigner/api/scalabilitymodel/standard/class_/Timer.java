/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("5bffffd7-c056-4549-b9f6-7f23196d79be")
    public static final String STEREOTYPE_NAME = "Timer";

    @objid ("a8780cec-3207-48b2-af27-7d2ebf026e90")
    public static final String MAXOCCURRENCENUM_TAGTYPE = "maxOccurrenceNum";

    @objid ("b40170e4-b01b-4f3d-923a-eb0d1712e579")
    public static final String TIMEVALUE_TAGTYPE = "timeValue";

    @objid ("77d290c1-41c7-44c2-ad98-16d5c46c8438")
    public static final String TYPE_TAGTYPE = "type";

    /**
     * Tells whether a {@link Timer proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Timer >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("130c320e-9b9b-4b70-bde8-6ef927d4b97d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Timer.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Timer >> then instantiate a {@link Timer} proxy.
     * 
     * @return a {@link Timer} proxy on the created {@link Class}.
     */
    @objid ("9cb8ee49-096b-4717-813e-96e969416c0b")
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
    @objid ("6006379b-f377-4c20-899c-5510a7663e39")
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
    @objid ("6737323d-c318-40e0-b9a2-992a001eb429")
    public static Timer safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Timer.canInstantiate(obj))
        	return new Timer(obj);
        else
        	throw new IllegalArgumentException("Timer: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cbce075b-04a5-4425-905c-4ab51bc1abec")
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
    @objid ("c5c6b062-0978-4dd2-9009-ab1b3b51b2bf")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'maxOccurrenceNum'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9735d220-9815-4881-bfa9-c8513b9a3883")
    public String getMaxOccurrenceNum() {
        return this.elt.getTagValue(Timer.MdaTypes.MAXOCCURRENCENUM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'timeValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("62faa1e2-ac16-4b16-82f3-9c5e72600264")
    public String getTimeValue() {
        return this.elt.getTagValue(Timer.MdaTypes.TIMEVALUE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("33e6563d-1bfd-4e6f-b60d-00c91dd8d9c1")
    public String getType() {
        return this.elt.getTagValue(Timer.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d5e449dc-02de-4be7-a7f1-dd0798de0fd9")
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

    @objid ("20fad9df-5873-4f80-bfc1-085cd490b28a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'maxOccurrenceNum'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f1571759-90cc-4fde-b9fe-15462c646ad7")
    public void setMaxOccurrenceNum(final String value) {
        this.elt.putTagValue(Timer.MdaTypes.MAXOCCURRENCENUM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'timeValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("54afe497-a513-4886-9ab6-3347853fbaed")
    public void setTimeValue(final String value) {
        this.elt.putTagValue(Timer.MdaTypes.TIMEVALUE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ebe0609d-dcfc-4517-94e3-95467de15d78")
    public void setType(final String value) {
        this.elt.putTagValue(Timer.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("db0c67d8-246f-4125-8cf2-441813a788cf")
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

    @objid ("697d9bc2-abb6-4764-a456-357239ddd958")
    protected Timer(final Class elt) {
        super(elt);
    }

    @objid ("93fa2506-690b-41f3-a6df-8e0ad6afab5e")
    public static final class MdaTypes {
        @objid ("9be392fc-02cf-4309-b64c-055b060811a9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("110e3f24-d45a-4d45-84cf-f8ed7022350a")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("f31bb4d1-bd14-4597-8717-e6ef60156b84")
        public static TagType TIMEVALUE_TAGTYPE_ELT;

        @objid ("b2bb5dd3-99d5-4563-bbdb-4cd942d62695")
        public static TagType MAXOCCURRENCENUM_TAGTYPE_ELT;

        @objid ("6a55eaec-4b50-4529-8184-91813f98430e")
        private static Stereotype MDAASSOCDEP;

        @objid ("84fdaf9a-85a7-4879-b87a-3daf7e3bd301")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("816475c5-99a0-423f-a588-7c24b0bf7c49")
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
