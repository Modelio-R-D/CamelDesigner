/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Enumeration} with << CloudLocation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ec445b98-cb41-4e0b-8577-5f1b03d78177")
public class CloudLocation extends Location {
    @objid ("c7a6f6cc-1d34-4cfb-8787-4b7df4e686f2")
    public static final String STEREOTYPE_NAME = "CloudLocation";

    @objid ("e90bb258-d49d-4e8c-8a86-81991ce0efb0")
    public static final String ISASSIGNABLE_TAGTYPE = "isAssignable";

    /**
     * Tells whether a {@link CloudLocation proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << CloudLocation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e8e17d54-491f-49ff-9df1-39ce40be3c02")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudLocation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << CloudLocation >> then instantiate a {@link CloudLocation} proxy.
     * 
     * @return a {@link CloudLocation} proxy on the created {@link Enumeration}.
     */
    @objid ("a0b8af6c-ee78-4801-a0e0-a9a70d79a362")
    public static CloudLocation create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Enumeration");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CloudLocation.STEREOTYPE_NAME);
        return CloudLocation.instantiate((Enumeration)e);
    }

    /**
     * Tries to instantiate a {@link CloudLocation} proxy from a {@link Enumeration} stereotyped << CloudLocation >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Enumeration
     * @return a {@link CloudLocation} proxy or <i>null</i>.
     */
    @objid ("dd190eb6-07cf-4bb8-b6a5-0b1a46beb53b")
    public static CloudLocation instantiate(final Enumeration obj) {
        return CloudLocation.canInstantiate(obj) ? new CloudLocation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CloudLocation} proxy from a {@link Enumeration} stereotyped << CloudLocation >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Enumeration}
     * @return a {@link CloudLocation} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("98694c27-04c8-44f7-9439-1805c835093b")
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
     */
    @objid ("cc9dac08-d189-4694-817f-030c1f01a127")
    public void addSubLocations(final CloudLocation obj) {
        if (obj!=null)
          ((Enumeration) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("231d8983-0575-456a-8e92-94aea026bab0")
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
     * 
     * @return the Enumeration represented by this proxy, never null.
     */
    @objid ("1b71fb1f-5ff4-4f77-aef9-f181404d7e08")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    /**
     * Get the value of the 'geographicalRegion' role.<p>
     * Role description:
     * null
     */
    @objid ("50d98dd3-9496-4e44-88a1-135e7a76ab7e")
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
     */
    @objid ("e1dbdef1-3678-4a8a-9b12-0a52c44296cb")
    public CloudLocation getParent() {
        return (CloudLocation)CamelDesignerProxyFactory.instantiate(((Enumeration) this.elt).getOwner(), CloudLocation.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'subLocations' role.<p>
     * Role description:
     * null
     */
    @objid ("4b6f18df-79ab-4e22-b080-8f9a6a08fe2d")
    public List<CloudLocation> getSubLocations() {
        List<CloudLocation> results = new ArrayList<>();
        for (ModelTree mObj : ((Enumeration) this.elt).getOwnedElement()){
            if (CloudLocation.canInstantiate(mObj))
                    results.add((CloudLocation)CamelDesignerProxyFactory.instantiate(mObj, CloudLocation.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    @objid ("6ea5ba94-6240-42a3-9082-a08c0c7bda1c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isAssignable'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fc0850a0-16ab-4ff5-a04e-77aa06974b73")
    public boolean isIsAssignable() {
        return this.elt.isTagged(CloudLocation.MdaTypes.ISASSIGNABLE_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'subLocations' role.<p>
     * Role description:
     * null
     */
    @objid ("3d3bbcae-c035-4e60-ba1c-5d35d38da5d0")
    public boolean removeSubLocations(final CloudLocation obj) {
        return (obj!=null)? ((Enumeration) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'geographicalRegion' role.<p>
     * Role description:
     * null
     */
    @objid ("ebc48ee8-1cb5-4870-868f-c15ca8726c80")
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
    @objid ("42874aab-fbb1-450d-9d8f-c446364aecae")
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
     */
    @objid ("d85f129f-3b90-4451-a251-1742d89e3eb4")
    public void setParent(final CloudLocation obj) {
        ((Enumeration) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("45b6e359-3de0-4fd6-b652-5a0740bc791d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getSubLocations());
        return result;
    }

    @objid ("a3a32df3-8e4f-4125-a3ab-72c8c9749610")
    protected CloudLocation(final Enumeration elt) {
        super(elt);
    }

    @objid ("2601abe9-713a-4dc1-b7a9-b34987ddef2b")
    public static final class MdaTypes {
        @objid ("b7cd7164-ac14-41cc-8389-5430c3bfefd0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c6a1a6b7-6362-4014-b5c7-ffae9b7cdd7d")
        public static TagType ISASSIGNABLE_TAGTYPE_ELT;

        @objid ("3f5cf4d6-c08b-4ec4-99ae-849da5ec8286")
        private static Stereotype MDAASSOCDEP;

        @objid ("ea32b664-1a50-4327-bf57-120487fee808")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2477a20f-97e8-4549-a744-820b4f8bb7a5")
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
