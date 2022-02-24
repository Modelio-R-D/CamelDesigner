/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.locationmodel.standard.enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Enumeration} with << CloudLocation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ec445b98-cb41-4e0b-8577-5f1b03d78177")
public class CloudLocation extends Location {
    @objid ("b56e02c6-672e-4e90-a9da-14b8e45f95dc")
    public static final String STEREOTYPE_NAME = "CloudLocation";

    @objid ("d0f8ad1c-a29f-40e0-8d34-7d38026baba2")
    public static final String ISASSIGNABLE_TAGTYPE = "isAssignable";

    /**
     * Tells whether a {@link CloudLocation proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << CloudLocation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9b3042ec-feb6-452b-af67-7e1519e8ec27")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudLocation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << CloudLocation >> then instantiate a {@link CloudLocation} proxy.
     * 
     * @return a {@link CloudLocation} proxy on the created {@link Enumeration}.
     */
    @objid ("bbf346b5-4623-4002-993f-b8a1edc11a68")
    public static CloudLocation create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Enumeration");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CloudLocation.STEREOTYPE_NAME);
        return CloudLocation.instantiate((Enumeration)e);
    }

    /**
     * Tries to instantiate a {@link CloudLocation} proxy from a {@link Enumeration} stereotyped << CloudLocation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Enumeration
     * @return a {@link CloudLocation} proxy or <i>null</i>.
     */
    @objid ("2470dbf3-95fe-4615-8050-c7f1d3453409")
    public static CloudLocation instantiate(final Enumeration obj) {
        return CloudLocation.canInstantiate(obj) ? new CloudLocation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CloudLocation} proxy from a {@link Enumeration} stereotyped << CloudLocation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Enumeration}
     * @return a {@link CloudLocation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c85a0705-c77e-451e-b8eb-1cd9d1897b15")
    public static CloudLocation safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (CloudLocation.canInstantiate(obj))
        	return new CloudLocation(obj);
        else
        	throw new IllegalArgumentException("CloudLocation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'subLocations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("799451cb-b89b-4698-aa7c-7b416d37f521")
    public void addSubLocations(final CloudLocation obj) {
        if (obj!=null)
          ((Enumeration) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("db7ad9c6-78b1-4f56-812b-9779d62abd79")
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
        CloudLocation other = (CloudLocation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Enumeration}. 
     * @return the Enumeration represented by this proxy, never null.
     */
    @objid ("b2a157c5-a6f8-43e7-8c90-ade1f13d5a6b")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    /**
     * Get the value of the 'geographicalRegion' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ac0863ef-b460-46b6-901b-5aef0a8009f7")
    public GeographicalRegion getGeographicalRegion() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CloudLocation.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CloudLocation.MdaTypes.MDAASSOCDEP_ROLE), "geographicalRegion")){
                  if (GeographicalRegion.canInstantiate(d.getDependsOn()))
                     return (GeographicalRegion)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), GeographicalRegion.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4ccca16b-61d0-4c87-a26c-ccb5fe4c5f5a")
    public CloudLocation getParent() {
        return (CloudLocation)CamelDesignerProxyFactory.instantiate(((Enumeration) this.elt).getOwner(), CloudLocation.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'subLocations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8f1573b6-e6cf-499e-8c76-40963dbe8108")
    public List<CloudLocation> getSubLocations() {
        List<CloudLocation> results = new ArrayList<>();
        for (ModelTree mObj : ((Enumeration) this.elt).getOwnedElement()){
        	if (CloudLocation.canInstantiate(mObj))
        			results.add((CloudLocation)CamelDesignerProxyFactory.instantiate(mObj, CloudLocation.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("6e757406-9f91-460e-88fb-16873d8fe781")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isAssignable'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("232307b0-99cb-4c0e-996e-1f34a0ab31f3")
    public boolean isIsAssignable() {
        return this.elt.isTagged(CloudLocation.MdaTypes.ISASSIGNABLE_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'subLocations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("902b62e9-3719-44b1-96c9-7128eaf3fb54")
    public boolean removeSubLocations(final CloudLocation obj) {
        return (obj!=null)? ((Enumeration) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'geographicalRegion' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("be694828-4047-4321-a35b-2f3544fe48ae")
    public void setGeographicalRegion(final GeographicalRegion obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(CloudLocation.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CloudLocation.MdaTypes.MDAASSOCDEP_ROLE), "geographicalRegion")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), CloudLocation.MdaTypes.MDAASSOCDEP);
              dep.setName("geographicalRegion");      dep.putTagValue(CloudLocation.MdaTypes.MDAASSOCDEP_ROLE, "geographicalRegion");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for boolean property 'isAssignable'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2c7414b6-f1c4-489a-994a-eb402bf6d907")
    public void setIsAssignable(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudLocation.MdaTypes.ISASSIGNABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudLocation.MdaTypes.ISASSIGNABLE_TAGTYPE_ELT);
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ae9075de-f8d3-4a0f-9baa-bb664630cb7e")
    public void setParent(final CloudLocation obj) {
        ((Enumeration) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("45b6e359-3de0-4fd6-b652-5a0740bc791d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("3b5b1633-55a9-43c6-bb77-c8a3f389c419")
    protected CloudLocation(final Enumeration elt) {
        super(elt);
    }

    @objid ("2601abe9-713a-4dc1-b7a9-b34987ddef2b")
    public static final class MdaTypes {
        @objid ("f9759a1c-213e-463f-be76-96d1c5e6fe31")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a7ed0445-e278-44d9-81ea-072e4fe09e27")
        public static TagType ISASSIGNABLE_TAGTYPE_ELT;

        @objid ("b70258a1-3ec1-44f8-a23c-fe9b2212eb7a")
        private static Stereotype MDAASSOCDEP;

        @objid ("48c6a8d4-039e-4cf7-93fd-cf5e55a2a3cb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6fba5cbb-31b6-4816-b4d9-54b0ecc02777")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "230c406e-effa-4238-9937-957af3c1a96d");
            ISASSIGNABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9636ddd4-581e-40c7-98e9-2ce66cca47e8");
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
