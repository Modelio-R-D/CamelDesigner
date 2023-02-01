/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ac10dc57-98cb-4abf-bf76-74d874951932")
    public static final String STEREOTYPE_NAME = "LocationCoupling";

    @objid ("aea33d43-0b1f-44ce-aa40-d88147950ebc")
    public static final String COUPLINGTYPE_TAGTYPE = "couplingType";

    @objid ("bc324d7a-dcee-49b4-bcad-382850cbf9bd")
=======
    @objid ("c0512dce-0811-44a2-b0b5-e50f00f4b38b")
    public static final String STEREOTYPE_NAME = "LocationCoupling";

    @objid ("22e0d69a-654b-4bdc-b5d2-ad616e77c0e1")
    public static final String COUPLINGTYPE_TAGTYPE = "couplingType";

    @objid ("3244643e-fa11-49dc-8fc4-2167ad9acf94")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String RELAXED_TAGTYPE = "relaxed";

    /**
     * Tells whether a {@link LocationCoupling proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << LocationCoupling >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("48e476a2-585b-4009-a035-c307fb48a41a")
=======
    @objid ("6785e261-b4a8-470f-83d0-9cf001228c50")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LocationCoupling.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << LocationCoupling >> then instantiate a {@link LocationCoupling} proxy.
     * 
     * @return a {@link LocationCoupling} proxy on the created {@link Connector}.
     */
<<<<<<< HEAD
    @objid ("4c52e051-f403-454e-b928-9b9e3c9c0f94")
=======
    @objid ("fd1bd5c4-2c98-497a-89c6-fee49c5f5ff4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("dfd184a6-9cd4-4831-9c02-742accc35f31")
=======
    @objid ("f3d072b7-e79a-4f8c-b6a6-56bda7363390")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("be3b9d5e-095c-485f-a6de-aab44d3118d1")
=======
    @objid ("52983012-97b8-49af-822d-95923ff9cceb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("2f7d1a3c-8ac2-4f5c-87e1-621c95c2cc07")
=======
    @objid ("7527a3b3-4516-4065-af5a-6d161c79cad5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addSoftwareComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), LocationCoupling.MdaTypes.MDAASSOCDEP);
            d.setName("softwareComponents");
            d.putTagValue(LocationCoupling.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponents");
        }
    }

<<<<<<< HEAD
    @objid ("a2df178c-7dd2-4350-a0d7-a428073bdcdd")
=======
    @objid ("e70445ac-519a-4245-bd42-d0a5383e12a1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c15de25d-4aa8-471b-98c9-dc57cace55ec")
=======
    @objid ("e64124e8-978c-4923-9e18-72133feb244c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getCouplingType() {
        return this.elt.getTagValue(LocationCoupling.MdaTypes.COUPLINGTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("4dfa288f-e301-4fc3-877f-239ac500af3b")
=======
    @objid ("b3df15b8-b5a4-4899-b6ae-24ea583ab0c6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("827f13b6-e834-4aa9-ac81-fe67f654c440")
=======
    @objid ("3dfe9b41-4f3c-4211-af24-9702c15e7149")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("f02a33ed-f921-428d-b488-e61a912e8412")
=======
    @objid ("fa0624ac-7e14-472a-a245-a33c907867e0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'relaxed'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("4038a41b-43a5-4768-8342-7b9762fe8ee1")
=======
    @objid ("80f2de75-7417-4442-af8e-ffb002bd6cb0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isRelaxed() {
        return this.elt.isTagged(LocationCoupling.MdaTypes.RELAXED_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'softwareComponents' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("badde719-1401-417e-8f58-06dff806d3af")
=======
    @objid ("748d6622-eba8-436e-8024-8df06630bd17")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("f8b7fd83-7700-49fa-90fb-6c50a955518c")
=======
    @objid ("b0f3ebf8-c712-4650-8cee-1befed24436a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setCouplingType(final String value) {
        this.elt.putTagValue(LocationCoupling.MdaTypes.COUPLINGTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'relaxed'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("f9307b23-689d-4ed9-9656-0c23216c0eba")
=======
    @objid ("3fdee447-1a82-40e2-acf3-46c81f640cbb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("74402e1b-6ddc-4346-9702-4ca0f3f26418")
=======
    @objid ("ee835ea9-7ae0-4065-8eb3-08a854e84024")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected LocationCoupling(final Connector elt) {
        super(elt);
    }

    @objid ("45955ff0-8335-4b65-a93f-e6357f827e77")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("bcdb543d-3dae-472a-916b-925e8c547874")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b64c296d-9e37-4051-912f-556f901d0c40")
        public static TagType COUPLINGTYPE_TAGTYPE_ELT;

        @objid ("9302c6bb-fece-4826-adc4-dda6e09a0a7e")
        public static TagType RELAXED_TAGTYPE_ELT;

        @objid ("b3c69544-19d6-4e7a-8d20-b92040080827")
        private static Stereotype MDAASSOCDEP;

        @objid ("5b955ed8-54a3-428e-adf3-65e1116cbcc7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("43702d01-6dbd-4605-bfc7-345d0d99e46e")
=======
        @objid ("3ec8b7ee-1355-48fd-9831-5a302061b6e2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cea6293f-6f23-459e-a5ef-7015bb986abf")
        public static TagType COUPLINGTYPE_TAGTYPE_ELT;

        @objid ("358fe6ed-8309-4e96-a4ab-40600e0170ab")
        public static TagType RELAXED_TAGTYPE_ELT;

        @objid ("ea5a6a5c-8472-4787-bbe5-54eabf6b782b")
        private static Stereotype MDAASSOCDEP;

        @objid ("90d07864-b186-45b2-ad53-fbce6ac2ebcb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a2f70bf3-81e7-4164-ac14-f00cb6ef37e6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
