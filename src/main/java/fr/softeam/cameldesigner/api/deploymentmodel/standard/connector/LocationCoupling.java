/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("26bd8130-fe39-4b6e-be22-ed7cf19b0b39")
    public static final String STEREOTYPE_NAME = "LocationCoupling";

    @objid ("16eefb89-2be5-4c0f-be25-4030366ced27")
    public static final String COUPLINGTYPE_TAGTYPE = "couplingType";

    @objid ("af729a91-df62-4d31-a103-fb0fe12deda5")
    public static final String RELAXED_TAGTYPE = "relaxed";

    /**
     * Tells whether a {@link LocationCoupling proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << LocationCoupling >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2903b241-cca7-440a-a894-1984889dc470")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationCoupling.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << LocationCoupling >> then instantiate a {@link LocationCoupling} proxy.
     * 
     * @return a {@link LocationCoupling} proxy on the created {@link Connector}.
     */
    @objid ("93f87858-89ae-45a0-a352-bb62dad01fe1")
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
    @objid ("1b97c5e0-889d-4c24-a501-93183ef99e54")
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
    @objid ("6071fc9c-36c3-4236-960f-6078581b5434")
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
    @objid ("04b93324-4d3e-4e0b-a677-10323c064e40")
    public void addSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), LocationCoupling.MdaTypes.MDAASSOCDEP);
            d.setName("softwareComponents");
            d.putTagValue(LocationCoupling.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponents");
        }
    }

    @objid ("0e96c607-95c3-4baa-bcd8-36deeb4bf564")
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
    @objid ("a715a6ff-2c60-4c5a-ad46-df28543a6493")
    public String getCouplingType() {
        return this.elt.getTagValue(LocationCoupling.MdaTypes.COUPLINGTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("9e1eb99d-c5b9-4e46-b101-9859958d51f1")
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
    @objid ("a4a78788-077e-4fe6-8c00-1499015133d2")
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

    @objid ("996ba71a-9c3b-49bd-8027-782f8d29a0a4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'relaxed'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a7401750-cc3a-4f44-9fb1-f0583489cbde")
    public boolean isRelaxed() {
        return this.elt.isTagged(LocationCoupling.MdaTypes.RELAXED_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'softwareComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3b5980e3-2da9-4e6f-959b-07e647a9f496")
    public boolean removeSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(LocationCoupling.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(LocationCoupling.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponents")) 
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
    @objid ("82b75b8f-8e05-42fb-a2d6-e859af323b53")
    public void setCouplingType(final String value) {
        this.elt.putTagValue(LocationCoupling.MdaTypes.COUPLINGTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'relaxed'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("793901a6-da5e-4f12-bf47-025a6c66ec20")
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

    @objid ("6ac37176-6c0f-408e-b9b1-c754c058dce5")
    protected LocationCoupling(final Connector elt) {
        super(elt);
    }

    @objid ("45955ff0-8335-4b65-a93f-e6357f827e77")
    public static final class MdaTypes {
        @objid ("3823d49c-9c34-46c5-ae07-1d7d66d0701c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("96bc258c-2ebc-4699-9c6d-6da2e3383d66")
        public static TagType COUPLINGTYPE_TAGTYPE_ELT;

        @objid ("76dfa130-5bdc-4664-b94a-defa4eea3033")
        public static TagType RELAXED_TAGTYPE_ELT;

        @objid ("c05e6883-9a31-424b-af24-a1e135428ab8")
        private static Stereotype MDAASSOCDEP;

        @objid ("97b18b78-e19c-437c-a3f9-15e4a0dbf97a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d6e80642-cb46-43f5-a212-029a2854ac98")
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
