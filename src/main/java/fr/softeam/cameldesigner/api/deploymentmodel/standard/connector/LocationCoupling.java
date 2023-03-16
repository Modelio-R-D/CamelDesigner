/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("e6f1ac81-321e-4c2d-b0cc-73227eb62580")
    public static final String STEREOTYPE_NAME = "LocationCoupling";

    @objid ("a3a1e0fa-0840-4a2d-93a6-1c15228d786f")
    public static final String COUPLINGTYPE_TAGTYPE = "couplingType";

    @objid ("6f4b76f2-d5ba-4703-9fe9-df6ca34a5af1")
    public static final String RELAXED_TAGTYPE = "relaxed";

    /**
     * Tells whether a {@link LocationCoupling proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << LocationCoupling >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1f8c627b-6364-4a98-a45a-9b7a9afaac67")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationCoupling.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << LocationCoupling >> then instantiate a {@link LocationCoupling} proxy.
     * 
     * @return a {@link LocationCoupling} proxy on the created {@link Connector}.
     */
    @objid ("2f65ca98-d075-4ecd-a93e-316cf0d4d9bf")
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
    @objid ("6a914bb9-36a8-404e-9040-21167d67283f")
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
    @objid ("77b2bba7-8047-45d9-adda-0c4533c5b7df")
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
    @objid ("4a50106b-ce21-437e-97a5-38b7d750e122")
    public void addSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), LocationCoupling.MdaTypes.MDAASSOCDEP);
            d.setName("softwareComponents");
            d.putTagValue(LocationCoupling.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponents");
        }
    }

    @objid ("ae5d26eb-4d9a-4df4-bd20-b0d8cb791248")
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
    @objid ("be64aea0-ae35-46df-ae05-8bdce55f3c73")
    public String getCouplingType() {
        return this.elt.getTagValue(LocationCoupling.MdaTypes.COUPLINGTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("fa3a308a-6276-4a3d-bfc4-6f610696b2e3")
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
    @objid ("74cbe5c1-5392-4be9-b91e-844637e84bfe")
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

    @objid ("714930b8-18a9-4e88-a2ff-c641771c6439")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'relaxed'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fab1142a-54ff-4816-8ee0-8e24191492f7")
    public boolean isRelaxed() {
        return this.elt.isTagged(LocationCoupling.MdaTypes.RELAXED_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'softwareComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5f2740e8-ffdb-474b-9f8a-69c384cd1eb9")
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
    @objid ("d4245425-879a-4599-a2bc-546f39073bb4")
    public void setCouplingType(final String value) {
        this.elt.putTagValue(LocationCoupling.MdaTypes.COUPLINGTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'relaxed'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4219f285-5eb8-4fc6-90ea-b42c9e9b1d6e")
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

    @objid ("41cdade0-46d5-4017-81b3-073f63a15066")
    protected LocationCoupling(final Connector elt) {
        super(elt);
    }

    @objid ("45955ff0-8335-4b65-a93f-e6357f827e77")
    public static final class MdaTypes {
        @objid ("90473749-2af6-4561-b375-091fa5b1993c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("694ecf40-097a-470a-92f2-fec7f3ee28bf")
        public static TagType COUPLINGTYPE_TAGTYPE_ELT;

        @objid ("b6e2a75f-7110-49c8-8107-94d42aa82bfb")
        public static TagType RELAXED_TAGTYPE_ELT;

        @objid ("a9468116-a8a2-4956-b7e7-144b2d6992d0")
        private static Stereotype MDAASSOCDEP;

        @objid ("bbee7252-676b-4b45-b340-1be1be0445f9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bcbbf18c-f488-40ca-8ad2-ab3920e5c0d2")
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
