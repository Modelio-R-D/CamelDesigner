/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << MmsProperty >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e54ed6d9-ad78-40db-9d11-255a1e3c76fc")
public class MmsProperty extends MmsObject {
    @objid ("f6fbead3-cf5e-4f92-b66b-ea0affc0aab6")
    public static final String STEREOTYPE_NAME = "MmsProperty";

    @objid ("49a8c139-74a8-4e3e-97dc-f02c8a109388")
    public static final String PROPERTYTYPE_TAGTYPE = "propertyType";

    @objid ("a7801e3d-5fb2-4da9-aab1-f44f8059c995")
    public static final String RANGEURI_TAGTYPE = "rangeUri";

    /**
     * Tells whether a {@link MmsProperty proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MmsProperty >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("74d27b47-2e32-451b-82a6-0deb6f580fd3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsProperty.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MmsProperty >> then instantiate a {@link MmsProperty} proxy.
     * 
     * @return a {@link MmsProperty} proxy on the created {@link Attribute}.
     */
    @objid ("53070bf3-1926-4555-9346-8b462ecc8175")
    public static MmsProperty create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MmsProperty.STEREOTYPE_NAME);
        return MmsProperty.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link MmsProperty} proxy from a {@link Attribute} stereotyped << MmsProperty >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Attribute
     * @return a {@link MmsProperty} proxy or <i>null</i>.
     */
    @objid ("226875ba-c4dc-4ca2-a988-ebd6ccc6da27")
    public static MmsProperty instantiate(final Attribute obj) {
        return MmsProperty.canInstantiate(obj) ? new MmsProperty(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MmsProperty} proxy from a {@link Attribute} stereotyped << MmsProperty >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Attribute}
     * @return a {@link MmsProperty} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7e915695-60e5-4219-868e-978b049e835e")
    public static MmsProperty safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (MmsProperty.canInstantiate(obj))
            return new MmsProperty(obj);
        else
            throw new IllegalArgumentException("MmsProperty: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5d5aaa45-f11a-4afc-b157-0c1f7a2015e7")
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
        MmsProperty other = (MmsProperty) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'domain' role.<p>
     * Role description:
     * null
     */
    @objid ("fc59b34f-9454-43da-9490-07101db845b4")
    public MmsConcept getDomain() {
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(MmsProperty.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MmsProperty.MdaTypes.MDAASSOCDEP_ROLE), "property")
              && MmsConcept.canInstantiate(d.getImpacted())) {
                  return (MmsConcept)CamelDesignerProxyFactory.instantiate(d.getImpacted(), MmsConcept.MdaTypes.STEREOTYPE_ELT.getName());
          }
        }
        return null;
    }

    /**
     * Get the underlying {@link Attribute}.
     * 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("4948655b-597d-4e48-ac58-91139ad1824c")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'propertyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8890eb94-177c-4b3c-a9df-90b0ff5ceb82")
    public String getPropertyType() {
        return this.elt.getTagValue(MmsProperty.MdaTypes.PROPERTYTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'range' role.<p>
     * Role description:
     * null
     */
    @objid ("e39e9644-7944-486b-be20-9603617aebc7")
    public MmsConcept getRange() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MmsProperty.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MmsProperty.MdaTypes.MDAASSOCDEP_ROLE), "range")
                  && MmsConcept.canInstantiate(d.getDependsOn())) {
                     return (MmsConcept)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConcept.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'rangeUri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("28eeadf6-d361-4c70-a02b-4929f6326060")
    public String getRangeUri() {
        return this.elt.getTagValue(MmsProperty.MdaTypes.RANGEURI_TAGTYPE_ELT);
    }

    @objid ("444b9f8f-eb3b-4a1e-be8f-668732933b5b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'domain' role.<p>
     * Role description:
     * null
     */
    @objid ("763fe976-ffd5-42fa-ba0e-6f4b36ce3005")
    public void setDomain(final MmsConcept obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getImpactedDependency())
          if (d.isStereotyped(MmsProperty.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MmsProperty.MdaTypes.MDAASSOCDEP_ROLE), "property")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if (dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(obj.getElement(), this.elt, MmsProperty.MdaTypes.MDAASSOCDEP);
              dep.setName("property");
              dep.putTagValue(MmsProperty.MdaTypes.MDAASSOCDEP_ROLE, "property");
          }
          dep.setImpacted(obj.getElement());
        }
    }

    /**
     * Setter for string property 'propertyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4309a053-970b-4fb6-83fc-9c3989760dec")
    public void setPropertyType(final String value) {
        this.elt.putTagValue(MmsProperty.MdaTypes.PROPERTYTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'range' role.<p>
     * Role description:
     * null
     */
    @objid ("538ffca2-c34d-4edd-8017-8228e48aab44")
    public void setRange(final MmsConcept obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MmsProperty.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MmsProperty.MdaTypes.MDAASSOCDEP_ROLE), "range")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MmsProperty.MdaTypes.MDAASSOCDEP);
              dep.setName("range");      dep.putTagValue(MmsProperty.MdaTypes.MDAASSOCDEP_ROLE, "range");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'rangeUri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3b201712-ebb5-40a8-aa3f-9ba4e03b1b7d")
    public void setRangeUri(final String value) {
        this.elt.putTagValue(MmsProperty.MdaTypes.RANGEURI_TAGTYPE_ELT, value);
    }

    @objid ("804fdef0-70e2-4245-a9a4-a6d0a861ad89")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("39ad8dd8-0c3d-4bb0-b307-bea05d8963fb")
    protected MmsProperty(final Attribute elt) {
        super(elt);
    }

    @objid ("37803f35-5e0b-4470-b34c-8406e4c82277")
    public static final class MdaTypes {
        @objid ("b9a6e497-a85d-4e75-8b70-f84dc117a937")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c8e2c1d9-d536-4293-936d-e7f9a74d84b5")
        public static TagType RANGEURI_TAGTYPE_ELT;

        @objid ("7552e802-5600-4a78-be95-087fe7fc9c38")
        public static TagType PROPERTYTYPE_TAGTYPE_ELT;

        @objid ("00d36f97-4b10-454b-9d51-7c29473a67ef")
        private static Stereotype MDAASSOCDEP;

        @objid ("26acd62d-ffa7-4dd3-884d-0601667eaeef")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("86cddf56-b19d-49ee-9368-ac6587edf73e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2fd479fe-3531-4636-aba9-b8fb0976fe66");
            RANGEURI_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d51c3381-6675-4439-9ba0-f0c7da269bcf");
            PROPERTYTYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fb35b00c-ff5a-4b21-b9bf-fdb16ef500e5");
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
