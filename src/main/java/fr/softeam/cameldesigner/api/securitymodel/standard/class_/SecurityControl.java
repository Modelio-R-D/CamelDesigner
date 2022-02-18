/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain;
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
    @objid ("5c095934-2911-4c81-ae53-250c2a5c4677")
    public static final String STEREOTYPE_NAME = "SecurityControl";

    @objid ("af659d83-b0cd-4f3e-9648-0b0934f0099d")
    public static final String ID_TAGTYPE = "id";

    @objid ("cc0f72a9-f02c-4f1d-8e57-bfc2defb3a7c")
    public static final String SPECIFICATION_TAGTYPE = "specification";

    /**
     * Tells whether a {@link SecurityControl proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityControl >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6a64f1eb-20a6-43b1-88fb-817f6b7a91b4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityControl.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityControl >> then instantiate a {@link SecurityControl} proxy.
     * 
     * @return a {@link SecurityControl} proxy on the created {@link Class}.
     */
    @objid ("a8561f06-e56a-4bf3-af4a-f95624173720")
    public static SecurityControl create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityControl.STEREOTYPE_NAME);
        return SecurityControl.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SecurityControl} proxy from a {@link Class} stereotyped << SecurityControl >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link SecurityControl} proxy or <i>null</i>.
     */
    @objid ("e2a040b4-bf82-49a3-bec5-0661d76b8c28")
    public static SecurityControl instantiate(final Class obj) {
        return SecurityControl.canInstantiate(obj) ? new SecurityControl(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityControl} proxy from a {@link Class} stereotyped << SecurityControl >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link SecurityControl} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7f435b44-79b2-4037-98a7-83aa461de611")
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
     * 
     */
    @objid ("ff9abdbb-a74b-4737-bc7a-e4771e001829")
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
     * 
     */
    @objid ("12bdd32f-d78a-4cdb-b7f9-3a7fd2733263")
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
     * 
     */
    @objid ("fe47620f-b52e-42bf-99a0-9503f3a93466")
    public void addSecurityProperties(final SecurityAttribute obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SecurityControl.MdaTypes.MDAASSOCDEP);
            d.setName("securityProperties");
            d.putTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE, "securityProperties");
        }
    }

    @objid ("b919cdda-7ca6-403b-aeef-0e21117709b0")
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
     * 
     */
    @objid ("c934b25f-05b5-4acf-8aa8-e1bc7e2ce9e4")
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
     * 
     */
    @objid ("aabfddd6-2075-4d12-bbe9-b6e16ae78e4d")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("533a77b7-16bd-4f53-90a8-85574ff42fba")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b358fcc3-aed5-41cb-9af6-d91535da8015")
    public String getId() {
        return this.elt.getTagValue(SecurityControl.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ac3d5aca-647e-4017-968c-e88a6f01ab20")
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
     * 
     */
    @objid ("2ff8b221-c0f1-4673-b446-7fc753fb858f")
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
    @objid ("c4748cf5-6cce-4d6a-810b-0be1be094399")
    public String getSpecification() {
        return this.elt.getTagValue(SecurityControl.MdaTypes.SPECIFICATION_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'subDomain' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("67699f42-9d51-470e-a0d9-f8227f122922")
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

    @objid ("d1836506-9687-4bdf-b9f1-d4bf572d7a8d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'compositeSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("decf8824-86f5-46fc-909c-dc7762ae7c41")
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
     * 
     */
    @objid ("9180f129-66bc-446b-b5c5-8cf1df17ef25")
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
     * 
     */
    @objid ("4d89e05f-c1be-439c-9ab8-e9b1a3627fdd")
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
     * 
     */
    @objid ("a0f3e606-d69c-4b33-a0c3-3928b0928e4c")
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
    @objid ("b468d4b2-93f2-42bc-97e9-517a375907f8")
    public void setId(final String value) {
        this.elt.putTagValue(SecurityControl.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'specification'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f59b664e-538e-48b9-a1a6-43bb8432df06")
    public void setSpecification(final String value) {
        this.elt.putTagValue(SecurityControl.MdaTypes.SPECIFICATION_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'subDomain' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("968a4382-30eb-4786-a5f7-7aec8acaadac")
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

    @objid ("923127bd-f994-4fb4-8da9-b1a5c1b9481d")
    protected SecurityControl(final Class elt) {
        super(elt);
    }

    @objid ("38164d2f-917e-4f65-a67d-254038d33f9e")
    public static final class MdaTypes {
        @objid ("0e9d6470-8f7e-4ec3-92c3-144b58136360")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ca812ead-8e50-4614-88f8-e67942307ef0")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("d98c49e0-d87d-47a5-9de9-d44330a8a5b0")
        public static TagType SPECIFICATION_TAGTYPE_ELT;

        @objid ("bc049b42-8f31-4167-9086-dce25d28240d")
        private static Stereotype MDAASSOCDEP;

        @objid ("9f1b6f39-0b16-498e-8bab-fb34de40b918")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e74b7e81-776d-4efc-81fd-38120edbe83c")
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
