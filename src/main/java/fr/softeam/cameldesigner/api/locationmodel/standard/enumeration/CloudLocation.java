/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("99e5dbc4-ffd6-45d3-8c67-3509ea4167ce")
    public static final String STEREOTYPE_NAME = "CloudLocation";

    @objid ("9e090df4-52fe-4175-b7dc-f7a4dfb6fe69")
    public static final String ISASSIGNABLE_TAGTYPE = "isAssignable";

    /**
     * Tells whether a {@link CloudLocation proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << CloudLocation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5dcf70e1-7b59-4eca-8726-1c7bc5dfd54b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudLocation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << CloudLocation >> then instantiate a {@link CloudLocation} proxy.
     * 
     * @return a {@link CloudLocation} proxy on the created {@link Enumeration}.
     */
    @objid ("21f1c95d-7058-47f9-aa5f-c52ce390f991")
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
    @objid ("a74c7476-9d2f-4297-a648-45e397a91c12")
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
    @objid ("7571a4ff-bdfc-4c72-a6ee-c16efdc8802a")
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
    @objid ("37b0caef-131a-48c5-8e13-b313e58d791d")
    public void addSubLocations(final CloudLocation obj) {
        if (obj!=null)
          ((Enumeration) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("e07a9eff-93a0-4d82-8b2b-5bf2942e44b8")
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
    @objid ("a43e8f06-a658-41f2-9faa-fc82df554ea3")
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
    @objid ("69a2a7f2-2ff8-4a23-9fc6-795e1af133cc")
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
    @objid ("6a63dfa8-83d0-4328-bb18-65405475a600")
    public CloudLocation getParent() {
        return (CloudLocation)CamelDesignerProxyFactory.instantiate(((Enumeration) this.elt).getOwner(), CloudLocation.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'subLocations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d6965d6b-f7fe-4928-8f15-b20f2c55d688")
    public List<CloudLocation> getSubLocations() {
        List<CloudLocation> results = new ArrayList<>();
        for (ModelTree mObj : ((Enumeration) this.elt).getOwnedElement()){
        	if (CloudLocation.canInstantiate(mObj))
        			results.add((CloudLocation)CamelDesignerProxyFactory.instantiate(mObj, CloudLocation.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("3567ead0-f228-465b-94fc-9ce3953edc48")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isAssignable'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d7246d4b-a7b4-4837-ae70-18e5f30d71c2")
    public boolean isIsAssignable() {
        return this.elt.isTagged(CloudLocation.MdaTypes.ISASSIGNABLE_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'subLocations' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6283b219-68d8-4389-8059-e61f85cf611e")
    public boolean removeSubLocations(final CloudLocation obj) {
        return (obj!=null)? ((Enumeration) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'geographicalRegion' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("82968c6d-d0da-481a-85b3-3e00ea1aa96d")
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
    @objid ("0b3bc751-88e0-4737-acaf-d9a571d8fc41")
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
    @objid ("232f25f1-e99d-4320-8a63-132c9e3af3e8")
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

    @objid ("8e2c7c13-3ca5-425b-9182-3ecff64c01e4")
    protected CloudLocation(final Enumeration elt) {
        super(elt);
    }

    @objid ("2601abe9-713a-4dc1-b7a9-b34987ddef2b")
    public static final class MdaTypes {
        @objid ("7fd883f9-340f-4a04-bfe3-267f726ebd32")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8a17a6e2-45e3-4c7d-b9d8-cf5c7f49eee8")
        public static TagType ISASSIGNABLE_TAGTYPE_ELT;

        @objid ("9ef9b123-678c-4c70-8078-77067d4c960e")
        private static Stereotype MDAASSOCDEP;

        @objid ("ac7c4c38-abbd-4cab-a7b0-8df6faadabb3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e20fcb51-6fc7-4cca-98af-fd903cb74af0")
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
