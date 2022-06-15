/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("441720d9-04f3-45db-8c1e-6e4fe29a76e7")
    public static final String STEREOTYPE_NAME = "Timer";

    @objid ("c1244c0a-a0f3-4593-b62a-83a5cf3ee7f4")
    public static final String MAXOCCURRENCENUM_TAGTYPE = "maxOccurrenceNum";

    @objid ("5ae1d1d8-b05e-4dfa-afcc-82c0c4496156")
    public static final String TIMEVALUE_TAGTYPE = "timeValue";

    @objid ("d42e61a9-99e1-4cc7-84a2-3733881de0b9")
    public static final String TYPE_TAGTYPE = "type";

    /**
     * Tells whether a {@link Timer proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Timer >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8ef06656-f3a1-463a-a122-2208bac96aea")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Timer.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Timer >> then instantiate a {@link Timer} proxy.
     * 
     * @return a {@link Timer} proxy on the created {@link Class}.
     */
    @objid ("01858505-4921-4c51-a1ca-1bb975dbf58f")
    public static Timer create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Timer.STEREOTYPE_NAME);
        return Timer.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Timer} proxy from a {@link Class} stereotyped << Timer >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link Timer} proxy or <i>null</i>.
     */
    @objid ("2c15a26e-7052-4738-b995-771cc516deb6")
    public static Timer instantiate(final Class obj) {
        return Timer.canInstantiate(obj) ? new Timer(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Timer} proxy from a {@link Class} stereotyped << Timer >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link Timer} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0ea73825-abd0-47be-9652-0c0c93f50941")
    public static Timer safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Timer.canInstantiate(obj))
            return new Timer(obj);
        else
            throw new IllegalArgumentException("Timer: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("160318e8-8192-475d-87e4-c2a1782ef381")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("7d5c5563-5935-4138-96cb-84a2c9ffe5a9")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'maxOccurrenceNum'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0f01df8e-5b25-4454-b25c-3036ff907ce4")
    public String getMaxOccurrenceNum() {
        return this.elt.getTagValue(Timer.MdaTypes.MAXOCCURRENCENUM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'timeValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c0cde02d-1717-4c04-9c59-099ef43059f5")
    public String getTimeValue() {
        return this.elt.getTagValue(Timer.MdaTypes.TIMEVALUE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fb1791cd-70f4-4b52-8832-76e471b6b4bf")
    public String getType() {
        return this.elt.getTagValue(Timer.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'unit' role.<p>
     * Role description:
     * null
     */
    @objid ("20fcb0e0-96f7-4359-ae0a-93a1d0771a72")
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

    @objid ("0cec73f0-93fc-46d2-8f96-c9715fedc864")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'maxOccurrenceNum'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1e9b2b6a-7f24-40ce-9a61-6d5d90659123")
    public void setMaxOccurrenceNum(final String value) {
        this.elt.putTagValue(Timer.MdaTypes.MAXOCCURRENCENUM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'timeValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e4a4f895-63eb-40a6-8463-3801c2dd5dfb")
    public void setTimeValue(final String value) {
        this.elt.putTagValue(Timer.MdaTypes.TIMEVALUE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ae8a26d2-590e-4fec-8909-886e214ab2aa")
    public void setType(final String value) {
        this.elt.putTagValue(Timer.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'unit' role.<p>
     * Role description:
     * null
     */
    @objid ("a1476385-c72c-456b-9068-b3ac14c7dbfb")
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

    @objid ("d9aeb582-4445-4c69-8d56-ef1116aa16b2")
    protected Timer(final Class elt) {
        super(elt);
    }

    @objid ("93fa2506-690b-41f3-a6df-8e0ad6afab5e")
    public static final class MdaTypes {
        @objid ("e3803f05-8eac-49e2-8b8c-5a26b9848081")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("118d3aba-4b08-479b-b1cc-9b367ef2f8ee")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("bf85ab09-dc7b-4cea-9d8d-0afe32b5db86")
        public static TagType TIMEVALUE_TAGTYPE_ELT;

        @objid ("99310a9b-2a41-4d59-83d2-7317bdc1e7b1")
        public static TagType MAXOCCURRENCENUM_TAGTYPE_ELT;

        @objid ("464ab878-a13c-4757-be61-4f0beccd9b6a")
        private static Stereotype MDAASSOCDEP;

        @objid ("7f377190-98af-4150-9d76-8be439db8baf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8620e07d-0d5e-4036-94a6-c3c236b2b309")
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
