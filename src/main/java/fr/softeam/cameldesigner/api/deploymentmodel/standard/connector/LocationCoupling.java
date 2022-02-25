/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.connector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
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
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Connector} with << LocationCoupling >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("16e16d1c-b0c0-4b95-94f1-b4ff8c2929e6")
public class LocationCoupling extends ComponentRelation {
    @objid ("80b7ef0a-ed73-4fd0-a9ac-a405a7574441")
    public static final String STEREOTYPE_NAME = "LocationCoupling";

    @objid ("28d9e2ba-f2b9-4a2b-a659-d8b7ffba02b8")
    public static final String COUPLINGTYPE_TAGTYPE = "couplingType";

    @objid ("f624fba1-d3eb-4a9b-b4bd-640975957e50")
    public static final String RELAXED_TAGTYPE = "relaxed";

    /**
     * Tells whether a {@link LocationCoupling proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << LocationCoupling >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("143e0a0a-ec4f-485b-9413-0be58428766a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationCoupling.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << LocationCoupling >> then instantiate a {@link LocationCoupling} proxy.
     * 
     * @return a {@link LocationCoupling} proxy on the created {@link Connector}.
     */
    @objid ("4874e570-7558-4d1f-bc73-c84ccc93600c")
    public static LocationCoupling create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, LocationCoupling.STEREOTYPE_NAME);
        return LocationCoupling.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link LocationCoupling} proxy from a {@link Connector} stereotyped << LocationCoupling >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link LocationCoupling} proxy or <i>null</i>.
     */
    @objid ("aa2b0f8f-69b1-4c0b-952f-3f9588e369b3")
    public static LocationCoupling instantiate(final Connector obj) {
        return LocationCoupling.canInstantiate(obj) ? new LocationCoupling(obj) : null;
    }

    /**
     * Tries to instantiate a {@link LocationCoupling} proxy from a {@link Connector} stereotyped << LocationCoupling >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link LocationCoupling} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c871b170-235c-489a-b312-b28fb1f5f9fe")
    public static LocationCoupling safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (LocationCoupling.canInstantiate(obj))
        	return new LocationCoupling(obj);
        else
        	throw new IllegalArgumentException("LocationCoupling: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'softwareComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8be2ddc8-f415-44d5-9497-150159d318d3")
    public void addSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), LocationCoupling.MdaTypes.MDAASSOCDEP);
            d.setName("softwareComponents");
            d.putTagValue(LocationCoupling.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponents");
        }
    }

    @objid ("2bf601c9-552e-44c9-a979-d36306e33c09")
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
        LocationCoupling other = (LocationCoupling) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'couplingType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d204e20c-a9f6-4842-a03c-2253c8453c84")
    public String getCouplingType() {
        return this.elt.getTagValue(LocationCoupling.MdaTypes.COUPLINGTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("3e2e54e2-39e6-4485-bc6c-c95cecfb6816")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    /**
     * Get the values of the 'softwareComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7f91061c-69c7-441f-a829-78dd69e6c6e8")
    public List<SoftwareComponent> getSoftwareComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(LocationCoupling.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(LocationCoupling.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponents")){
              if (Sensor.canInstantiate(d.getDependsOn()))
                results.add((Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName()));
              if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                results.add((SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1fd0dc41-5169-4325-b441-2660e5a2867c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'relaxed'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c277753c-1e5e-4920-a11a-c381e02491a2")
    public boolean isRelaxed() {
        return this.elt.isTagged(LocationCoupling.MdaTypes.RELAXED_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'softwareComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("47f9d0aa-d511-46a8-95bc-8778d4926ed9")
    public boolean removeSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(LocationCoupling.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(LocationCoupling.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for string property 'couplingType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0d914544-0894-4706-b334-d445691fbd8f")
    public void setCouplingType(final String value) {
        this.elt.putTagValue(LocationCoupling.MdaTypes.COUPLINGTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'relaxed'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7b92ea30-8c6d-49c0-bd75-cbbf30aa60ea")
    public void setRelaxed(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(LocationCoupling.MdaTypes.RELAXED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(LocationCoupling.MdaTypes.RELAXED_TAGTYPE_ELT);
    }

    @objid ("1fceca1c-4022-4e4a-abad-81d8c4c690a2")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("1bd5fb8a-98d6-454d-b0f9-8d7cf91b0dfe")
    protected LocationCoupling(final Connector elt) {
        super(elt);
    }

    @objid ("45955ff0-8335-4b65-a93f-e6357f827e77")
    public static final class MdaTypes {
        @objid ("1aaedd00-310a-4e63-9be8-6266835241ec")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("17fb251e-4fd1-4f41-a063-72c64667d973")
        public static TagType COUPLINGTYPE_TAGTYPE_ELT;

        @objid ("e2b378a0-55e1-46ca-b6ee-e3524b5292cf")
        public static TagType RELAXED_TAGTYPE_ELT;

        @objid ("3ad830f9-3653-4d49-baea-57867ed4fe34")
        private static Stereotype MDAASSOCDEP;

        @objid ("10b3d9bc-4fc6-43d9-8cf5-a48c053081ad")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9d5243d6-d2ec-4b81-8f5c-e91d64506d81")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "09dbc4af-5728-4b42-9d70-83e64d7205dd");
            COUPLINGTYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e8ff5d38-9710-482d-84f1-69e389fdd673");
            RELAXED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c2d7df3f-0813-48ef-bbc6-545b50985067");
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
