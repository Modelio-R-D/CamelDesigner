/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("f5a660cc-1d12-45bc-84f4-a2488d2a4588")
    public static final String STEREOTYPE_NAME = "SecurityControl";

    @objid ("a44bd0fa-8108-4dac-bd6c-27dbbd021837")
    public static final String ID_TAGTYPE = "id";

    @objid ("55f74dc5-ad82-4052-8cfc-710495b2e6b2")
    public static final String SPECIFICATION_TAGTYPE = "specification";

    /**
     * Tells whether a {@link SecurityControl proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityControl >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c43c8e5c-e392-4e95-8689-ef867d5e9c00")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityControl.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityControl >> then instantiate a {@link SecurityControl} proxy.
     * 
     * @return a {@link SecurityControl} proxy on the created {@link Class}.
     */
    @objid ("d14ea54f-4f4c-4747-bb10-9ee32abed5cb")
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
    @objid ("94c135dc-e03b-499b-8def-db51285d9dc3")
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
    @objid ("fe55a112-8242-4d9c-87f4-c7c54204f612")
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
    @objid ("21149898-923c-4a1b-9127-adefa6b07ab4")
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
    @objid ("44ae356f-029a-4812-87a4-8f3786705ab7")
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
    @objid ("5616452a-4c79-4cd8-9812-166c504e80c3")
    public void addSecurityProperties(final SecurityAttribute obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SecurityControl.MdaTypes.MDAASSOCDEP);
            d.setName("securityProperties");
            d.putTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE, "securityProperties");
        }
    }

    @objid ("260f6e61-535a-4530-9963-247ebc03e1eb")
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
    @objid ("2bd108bb-8a00-415e-b2e1-d0b9a1413a7b")
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
    @objid ("844cf429-06b1-43ec-8e2b-5b4df6d07c14")
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
    @objid ("7a7488cd-ce2c-4e25-9b1b-e93ef31292fd")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d09e7a4a-b5d8-4d83-9e20-41eee9cb0f2a")
    public String getId() {
        return this.elt.getTagValue(SecurityControl.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("304357e6-3de5-4d04-a397-5c580b2ed649")
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
    @objid ("0a489745-b539-49bc-9e39-09061aae25e8")
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
    @objid ("713a1ea0-771f-4909-9b2b-017b3f78ce41")
    public String getSpecification() {
        return this.elt.getTagValue(SecurityControl.MdaTypes.SPECIFICATION_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'subDomain' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4420bc26-3ce2-42c4-b859-a88b1f639861")
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

    @objid ("050023ee-af37-44ac-a63f-4b6b12ec78fc")
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
    @objid ("3f3b364c-4301-4ad0-bc55-3fe8265f1e5c")
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
    @objid ("ec23627c-9e74-4601-ac13-55f94df5e88e")
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
    @objid ("5db5ac20-776d-47b2-aa3b-51debdff8a1a")
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
    @objid ("b7f69386-a2e5-471b-b809-17fc458ca20e")
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
    @objid ("e68fc148-4a3b-4f88-a23d-aadc13a0ab14")
    public void setId(final String value) {
        this.elt.putTagValue(SecurityControl.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'specification'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0f23104f-8a60-4d3d-a972-2a3c5394c2f7")
    public void setSpecification(final String value) {
        this.elt.putTagValue(SecurityControl.MdaTypes.SPECIFICATION_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'subDomain' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a54d28eb-ef47-49da-b952-cfb98a321491")
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

    @objid ("dde3910e-9316-4609-9d91-4fb64161cc0b")
    protected SecurityControl(final Class elt) {
        super(elt);
    }

    @objid ("38164d2f-917e-4f65-a67d-254038d33f9e")
    public static final class MdaTypes {
        @objid ("f7d8655c-3e42-45de-8b03-0104f097f3c0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4057275a-4320-4aab-b0eb-f54da84b0187")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("ea8ffc6a-5ab5-439b-b5fb-dac7bdf77cda")
        public static TagType SPECIFICATION_TAGTYPE_ELT;

        @objid ("d25663e2-a856-44c0-8e25-5bd8332c94fa")
        private static Stereotype MDAASSOCDEP;

        @objid ("18a766bb-b3bb-4d78-8c54-9a75d546d857")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ed412cf3-66e0-4161-9675-178a04bd0695")
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
