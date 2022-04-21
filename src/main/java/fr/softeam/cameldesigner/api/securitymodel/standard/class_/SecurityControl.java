/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.securitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << SecurityControl >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d61a388a-d45a-42f2-ba0d-ab77ccfcec55")
public class SecurityControl extends FeatureClass {
    @objid ("014c3c29-b5bb-40a3-8fd1-aa95449ee8fc")
    public static final String STEREOTYPE_NAME = "SecurityControl";

    @objid ("6cdbd27b-0d83-4684-b427-10856a410948")
    public static final String ID_TAGTYPE = "id";

    @objid ("f633b1b3-1b9b-4686-bdd1-90ab5dbc9f1d")
    public static final String SPECIFICATION_TAGTYPE = "specification";

    /**
     * Tells whether a {@link SecurityControl proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityControl >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9042a327-99bd-401e-8e05-baf8d1ffb0f7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityControl.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityControl >> then instantiate a {@link SecurityControl} proxy.
     * 
     * @return a {@link SecurityControl} proxy on the created {@link Class}.
     */
    @objid ("80814e5f-20f3-4ec8-a8c3-6eeab406cd18")
    public static SecurityControl create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityControl.STEREOTYPE_NAME);
        return SecurityControl.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SecurityControl} proxy from a {@link Class} stereotyped << SecurityControl >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link SecurityControl} proxy or <i>null</i>.
     */
    @objid ("2ed44cc2-65bc-467e-9635-1484a8c664dc")
    public static SecurityControl instantiate(final Class obj) {
        return SecurityControl.canInstantiate(obj) ? new SecurityControl(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityControl} proxy from a {@link Class} stereotyped << SecurityControl >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link SecurityControl} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("da695192-84fe-4498-a723-9a6fd61f04d3")
    public static SecurityControl safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SecurityControl.canInstantiate(obj))
            return new SecurityControl(obj);
        else
            throw new IllegalArgumentException("SecurityControl: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'compositeSecurityMetrics' role.<p>
     * Role description:
     * null
     */
    @objid ("fa425708-645f-4739-a010-f5b2c78e6024")
    public void addCompositeSecurityMetrics(final CompositeSecurityMetric obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SecurityControl.MdaTypes.MDAASSOCDEP);
            d.setName("compositeSecurityMetrics");
            d.putTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE, "compositeSecurityMetrics");
        }
    }

    /**
     * Add a value to the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     */
    @objid ("4c543372-5b60-4caa-9074-fa76cdbeb895")
    public void addRawSecurityMetrics(final RawSecurityMetric obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SecurityControl.MdaTypes.MDAASSOCDEP);
            d.setName("rawSecurityMetrics");
            d.putTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE, "rawSecurityMetrics");
        }
    }

    /**
     * Add a value to the 'securityProperties' role.<p>
     * Role description:
     * null
     */
    @objid ("0def79f4-97f5-4f1c-a891-ae9f9cc673f2")
    public void addSecurityProperties(final SecurityAttribute obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SecurityControl.MdaTypes.MDAASSOCDEP);
            d.setName("securityProperties");
            d.putTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE, "securityProperties");
        }
    }

    @objid ("6beb59aa-b76d-47fc-8926-8bd0e44f0245")
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
        SecurityControl other = (SecurityControl) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'compositeSecurityMetrics' role.<p>
     * Role description:
     * null
     */
    @objid ("208a70c6-d430-4673-91bc-112a309936a7")
    public List<CompositeSecurityMetric> getCompositeSecurityMetrics() {
        List<CompositeSecurityMetric> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "compositeSecurityMetrics")){
              if (CompositeSecurityMetric.canInstantiate(d.getDependsOn()))
                results.add((CompositeSecurityMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeSecurityMetric.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'domain' role.<p>
     * Role description:
     * null
     */
    @objid ("f9ae6e03-d64f-4add-b630-758660ee3cbe")
    public SecurityDomain getDomain() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "domain")){
                  if (SecurityDomain.canInstantiate(d.getDependsOn()))
                     return (SecurityDomain)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityDomain.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("39831a8b-bfad-4bff-a1c5-8e5e62ff6058")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6f89c958-6fb1-4bbc-8f2c-2f00f13b5714")
    public String getId() {
        return this.elt.getTagValue(SecurityControl.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     */
    @objid ("41a90e04-54dd-4ec6-8b41-70079d41c138")
    public List<RawSecurityMetric> getRawSecurityMetrics() {
        List<RawSecurityMetric> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "rawSecurityMetrics")){
              if (RawSecurityMetric.canInstantiate(d.getDependsOn()))
                results.add((RawSecurityMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RawSecurityMetric.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'securityProperties' role.<p>
     * Role description:
     * null
     */
    @objid ("2de0cf19-c849-45fa-a32f-16c991803887")
    public List<SecurityAttribute> getSecurityProperties() {
        List<SecurityAttribute> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "securityProperties")){
              if (Certifiable.canInstantiate(d.getDependsOn()))
                results.add((Certifiable)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Certifiable.MdaTypes.STEREOTYPE_ELT.getName()));
              if (SecurityAttribute.canInstantiate(d.getDependsOn()))
                results.add((SecurityAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityAttribute.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for string property 'specification'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("07f9fcce-dcc0-441a-abad-7801ea6c8f50")
    public String getSpecification() {
        return this.elt.getTagValue(SecurityControl.MdaTypes.SPECIFICATION_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'subDomain' role.<p>
     * Role description:
     * null
     */
    @objid ("45555159-98ff-4089-8212-ea61e911417c")
    public SecurityDomain getSubDomain() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "subDomain")){
                  if (SecurityDomain.canInstantiate(d.getDependsOn()))
                     return (SecurityDomain)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityDomain.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("a4401f53-2bd8-4993-aa6d-fc38be851a54")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'compositeSecurityMetrics' role.<p>
     * Role description:
     * null
     */
    @objid ("588abedb-16b1-4b1a-9fe6-d9e160b08294")
    public boolean removeCompositeSecurityMetrics(final CompositeSecurityMetric obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     */
    @objid ("8a82e14c-913a-4ee6-b29d-0ad56e6024e2")
    public boolean removeRawSecurityMetrics(final RawSecurityMetric obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'securityProperties' role.<p>
     * Role description:
     * null
     */
    @objid ("80a3ae24-4483-4bd9-aa30-27cdb0592f64")
    public boolean removeSecurityProperties(final SecurityAttribute obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'domain' role.<p>
     * Role description:
     * null
     */
    @objid ("d115e285-fa9d-4509-9d17-0aa1d1870342")
    public void setDomain(final SecurityDomain obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "domain")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), SecurityControl.MdaTypes.MDAASSOCDEP);
              dep.setName("domain");      dep.putTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE, "domain");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("064ae49e-1d3a-4000-a696-c1fcfd51c77f")
    public void setId(final String value) {
        this.elt.putTagValue(SecurityControl.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'specification'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("05b7f71e-5fd4-4f99-a132-6381cad7943e")
    public void setSpecification(final String value) {
        this.elt.putTagValue(SecurityControl.MdaTypes.SPECIFICATION_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'subDomain' role.<p>
     * Role description:
     * null
     */
    @objid ("44741efd-4e98-41d0-bfe2-04b83cd46e7e")
    public void setSubDomain(final SecurityDomain obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "subDomain")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), SecurityControl.MdaTypes.MDAASSOCDEP);
              dep.setName("subDomain");      dep.putTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE, "subDomain");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("4281a4b4-f2ee-4fb6-b82e-fc1791f02ec5")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("1c77fd24-93e2-4a63-aef4-32fef98c8e31")
    protected SecurityControl(final Class elt) {
        super(elt);
    }

    @objid ("38164d2f-917e-4f65-a67d-254038d33f9e")
    public static final class MdaTypes {
        @objid ("f6b249c2-aa1b-4fd4-9299-296f7cbd7e22")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9e5f80b0-0ff7-4200-bb13-944ddce565ef")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("c810114a-5557-4836-b247-842c1b584ee1")
        public static TagType SPECIFICATION_TAGTYPE_ELT;

        @objid ("0fc4cdc5-f31b-4724-9e3e-696174bb20c6")
        private static Stereotype MDAASSOCDEP;

        @objid ("654afb6c-e0eb-499f-849e-06c4d289bfc1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3236ccbf-9371-42fd-945b-9e6c0f2acc02")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0cf7fb23-2fb5-4c33-8d52-c3db4e05bb34");
            ID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0865d90-2ead-4a1b-825d-1611f8206fcb");
            SPECIFICATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2caf403e-3e13-413c-9bb9-2e53d9d92f78");
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
