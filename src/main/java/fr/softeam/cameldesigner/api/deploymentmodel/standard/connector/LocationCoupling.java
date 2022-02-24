/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("8168b932-8569-469c-83b6-fe9e82d368e2")
    public static final String STEREOTYPE_NAME = "LocationCoupling";

    @objid ("638a1600-208a-406a-a5a9-10e2b2c329a6")
    public static final String COUPLINGTYPE_TAGTYPE = "couplingType";

    @objid ("a9a79b75-08e3-4285-b8cf-88f9dc2252b8")
    public static final String RELAXED_TAGTYPE = "relaxed";

    /**
     * Tells whether a {@link LocationCoupling proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << LocationCoupling >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("823e46e0-ee75-4da5-99fe-e2fc62bc6e76")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationCoupling.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << LocationCoupling >> then instantiate a {@link LocationCoupling} proxy.
     * 
     * @return a {@link LocationCoupling} proxy on the created {@link Connector}.
     */
    @objid ("9366774f-9850-4342-bde0-54b8adec5929")
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
    @objid ("8f268150-fb11-40a8-998b-50e83ff04a05")
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
    @objid ("5f1ecf1f-523f-4329-8ed1-ed011bb9843e")
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
    @objid ("3b6dc93f-ec93-46f0-8e9c-a7121f92dda6")
    public void addSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), LocationCoupling.MdaTypes.MDAASSOCDEP);
            d.setName("softwareComponents");
            d.putTagValue(LocationCoupling.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponents");
        }
    }

    @objid ("e80b266b-2e12-481f-b1de-f84661c0b91c")
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
    @objid ("bbd16dd1-d05e-44f4-a94a-0fde4653a874")
    public String getCouplingType() {
        return this.elt.getTagValue(LocationCoupling.MdaTypes.COUPLINGTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("a798d5c6-b6ad-4f5b-b2aa-279c516565d1")
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
    @objid ("2e9766e1-dba9-46ac-af57-6b7cea0a8d91")
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

    @objid ("dce5c8ed-d385-44cd-b74c-95dfbdd3a7ad")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'relaxed'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("53953f34-4d0c-4f4c-b80c-94c31f5a321a")
    public boolean isRelaxed() {
        return this.elt.isTagged(LocationCoupling.MdaTypes.RELAXED_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'softwareComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fde1c27c-1f6e-4d7e-ad5b-307434cbdba5")
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
    @objid ("974274ee-c463-4237-81de-02f3ae57aa5d")
    public void setCouplingType(final String value) {
        this.elt.putTagValue(LocationCoupling.MdaTypes.COUPLINGTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'relaxed'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f6521737-984a-43f8-9eaf-f1425e374f59")
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

    @objid ("d9b0dd4c-b66c-4968-a082-644efa3df9f7")
    protected LocationCoupling(final Connector elt) {
        super(elt);
    }

    @objid ("45955ff0-8335-4b65-a93f-e6357f827e77")
    public static final class MdaTypes {
        @objid ("04204e81-6d7e-434a-b3ac-c8f160c605ff")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("74b861e6-a107-4684-9ffc-850fa4409f1e")
        public static TagType COUPLINGTYPE_TAGTYPE_ELT;

        @objid ("11b57102-c08d-49d8-854a-e6d25ca68e01")
        public static TagType RELAXED_TAGTYPE_ELT;

        @objid ("f16e1c7f-db82-4a61-87d9-893814e1630e")
        private static Stereotype MDAASSOCDEP;

        @objid ("6421b21e-55fe-487a-92c0-468d0d8237fe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e66d0f5c-c431-4b71-93ef-371be55a6908")
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
