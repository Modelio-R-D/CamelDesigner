/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
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
    @objid ("60cd81be-fb9b-4b78-a5b7-0f68d19e7fe2")
    public static final String STEREOTYPE_NAME = "CloudLocation";

    @objid ("d047febd-9e15-4c21-8610-8665b4aa4df4")
    public static final String ISASSIGNABLE_TAGTYPE = "isAssignable";

    /**
     * Tells whether a {@link CloudLocation proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << CloudLocation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8f9189fd-7a83-49cf-b465-eba76c50aed3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudLocation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << CloudLocation >> then instantiate a {@link CloudLocation} proxy.
     * 
     * @return a {@link CloudLocation} proxy on the created {@link Enumeration}.
     */
    @objid ("6c218809-1467-4a06-bf8e-a798ea66a9ba")
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
    @objid ("6b7aa530-2516-425e-8c68-500b6412aa66")
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
    @objid ("67c005be-e680-48ed-8d42-fcc798d612d3")
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
    @objid ("e95b553e-f161-42d7-b865-1cbc77121201")
    public void addSubLocations(final CloudLocation obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CloudLocation.MdaTypes.MDAASSOCDEP);
            d.setName("subLocations");
            d.putTagValue(CloudLocation.MdaTypes.MDAASSOCDEP_ROLE, "subLocations");
        }
    }

    @objid ("855e109c-1463-40f1-85ae-df2da850f3d3")
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
    @objid ("21c6e7fb-91be-4a9d-9e25-4cffa51f3e6e")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    /**
     * Get the value of the 'geographicalRegion' role.<p>
     * Role description:
     * null
     */
    @objid ("fe100c18-d38d-4bad-b901-9cd9e448eece")
    public GeographicalRegion getGeographicalRegion() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CloudLocation.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CloudLocation.MdaTypes.MDAASSOCDEP_ROLE), "geographicalRegion")
                  && GeographicalRegion.canInstantiate(d.getDependsOn())) {
                     return (GeographicalRegion)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), GeographicalRegion.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("2043200e-7f87-413d-be00-f903cc53e6b9")
    public CloudLocation getParent() {
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(CloudLocation.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CloudLocation.MdaTypes.MDAASSOCDEP_ROLE), "subLocations")
              && CloudLocation.canInstantiate(d.getImpacted())) {
                  return (CloudLocation)CamelDesignerProxyFactory.instantiate(d.getImpacted(), CloudLocation.MdaTypes.STEREOTYPE_ELT.getName());
          }
        }
        return null;
    }

    /**
     * Get the values of the 'subLocations' role.<p>
     * Role description:
     * null
     */
    @objid ("7513d70b-72da-488e-93c3-9c55f1068188")
    public List<CloudLocation> getSubLocations() {
        List<CloudLocation> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(CloudLocation.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CloudLocation.MdaTypes.MDAASSOCDEP_ROLE), "subLocations")
              && CloudLocation.canInstantiate(d.getDependsOn()))
                results.add((CloudLocation)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CloudLocation.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f6946229-f786-4117-af52-c21c78229a9b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isAssignable'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8854e3d4-c9a9-49bc-8476-0405cfedd69d")
    public boolean isIsAssignable() {
        return this.elt.isTagged(CloudLocation.MdaTypes.ISASSIGNABLE_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'subLocations' role.<p>
     * Role description:
     * null
     */
    @objid ("90454b78-b1e9-4292-aea4-71e57f82edc7")
    public boolean removeSubLocations(final CloudLocation obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(CloudLocation.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CloudLocation.MdaTypes.MDAASSOCDEP_ROLE), "parent")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'geographicalRegion' role.<p>
     * Role description:
     * null
     */
    @objid ("0447ec3e-4985-4241-a271-2459e9835ddd")
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
    @objid ("aa100b1d-7ebc-4a1e-841b-6ab85e4e40c2")
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
    @objid ("670e581e-7bfe-4dd6-a059-aba1257b32a9")
    public void setParent(final CloudLocation obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getImpactedDependency())
          if (d.isStereotyped(CloudLocation.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CloudLocation.MdaTypes.MDAASSOCDEP_ROLE), "subLocations")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if (dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(obj.getElement(), this.elt, CloudLocation.MdaTypes.MDAASSOCDEP);
              dep.setName("subLocations");
              dep.putTagValue(CloudLocation.MdaTypes.MDAASSOCDEP_ROLE, "subLocations");
          }
          dep.setImpacted(obj.getElement());
        }
    }

    @objid ("ec9686f5-d887-458d-8ea1-e918b75dfbcc")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("c6245f66-b340-4309-b4b0-57c428eb665c")
    protected CloudLocation(final Enumeration elt) {
        super(elt);
    }

    @objid ("2601abe9-713a-4dc1-b7a9-b34987ddef2b")
    public static final class MdaTypes {
        @objid ("066de9bf-8cf2-44d6-a9c9-85b170f753b0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9b868e38-0cf1-4972-b0f3-f42560aa9b3e")
        public static TagType ISASSIGNABLE_TAGTYPE_ELT;

        @objid ("91f1fff5-eb5e-4185-87e9-eeb85c565dec")
        private static Stereotype MDAASSOCDEP;

        @objid ("9a563f0e-4835-43be-907d-8ae78767505b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ce7b1503-707f-4e95-aed5-f32a99a79b5f")
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
