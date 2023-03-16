/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("1214a427-f992-4f24-b8a1-675e191bcb93")
    public static final String STEREOTYPE_NAME = "SecurityControl";

    @objid ("54060e42-563d-45a1-b3b2-2a23387dadbe")
    public static final String ID_TAGTYPE = "id";

    @objid ("2c4dfbdb-1ff8-4853-b88b-5055683f34ff")
    public static final String SPECIFICATION_TAGTYPE = "specification";

    /**
     * Tells whether a {@link SecurityControl proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityControl >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("892901d5-e113-46a3-8274-dda35d5bda16")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityControl.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityControl >> then instantiate a {@link SecurityControl} proxy.
     * 
     * @return a {@link SecurityControl} proxy on the created {@link Class}.
     */
    @objid ("c763dc42-ce51-4c68-9c24-bc5852d7b0b5")
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
    @objid ("36eba187-c786-490f-ae12-f7612dee897f")
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
    @objid ("c23925c8-e1c7-46d7-b676-71fb99f9a369")
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
    @objid ("9bf888d3-4f8c-472f-85d6-177f6a067cf6")
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
    @objid ("6dd1eeb2-b413-457c-b4b2-dacfc0fffa0c")
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
    @objid ("d55f8633-c442-44e1-9810-27ff2fe28a94")
    public void addSecurityProperties(final SecurityAttribute obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SecurityControl.MdaTypes.MDAASSOCDEP);
            d.setName("securityProperties");
            d.putTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE, "securityProperties");
        }
    }

    @objid ("1337f979-05fe-4022-b3e0-010385c38e5b")
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
    @objid ("686f8f9f-7782-41f6-937f-a6d763742c74")
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
    @objid ("fbe86080-d3fb-460c-808c-458c704cb5be")
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
    @objid ("c947dafe-3526-463d-baed-ca6e3152cc17")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bfedc74d-14de-420d-9da0-34316d9788d0")
    public String getId() {
        return this.elt.getTagValue(SecurityControl.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("14096493-70f3-46d5-bc29-5e8855ed367f")
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
    @objid ("28fb72d4-cd48-41c3-bbf1-a3a066e4bff1")
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
    @objid ("731bc511-9d8d-4018-b05c-c4b18ed8984a")
    public String getSpecification() {
        return this.elt.getTagValue(SecurityControl.MdaTypes.SPECIFICATION_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'subDomain' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5fd9c213-4736-473a-9edd-31a32da85663")
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

    @objid ("e9dc1877-0e52-4c9d-9427-7ee03a2c444b")
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
    @objid ("51a63fce-6c1f-4c25-901a-c6406ba50ab1")
    public boolean removeCompositeSecurityMetrics(final CompositeSecurityMetric obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "compositeSecurityMetrics")) 
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
    @objid ("586a6033-a824-4b9a-858b-34cc5f7a07a6")
    public boolean removeRawSecurityMetrics(final RawSecurityMetric obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "rawSecurityMetrics")) 
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
    @objid ("4ec6eda6-5545-40ec-b020-49125beb1872")
    public boolean removeSecurityProperties(final SecurityAttribute obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "securityProperties")) 
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
    @objid ("d1ba2650-b281-494d-ab6d-6263b667dac2")
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
    @objid ("c19bb16b-f9aa-467c-ad54-ba684d3f62d1")
    public void setId(final String value) {
        this.elt.putTagValue(SecurityControl.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'specification'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4c8f1630-01e2-4e2d-a385-37a4194fc5c8")
    public void setSpecification(final String value) {
        this.elt.putTagValue(SecurityControl.MdaTypes.SPECIFICATION_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'subDomain' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("dfb13403-7486-4263-9260-996e83e7817f")
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

    @objid ("a51438a7-65a0-4e40-87f7-70533fc045a1")
    protected SecurityControl(final Class elt) {
        super(elt);
    }

    @objid ("38164d2f-917e-4f65-a67d-254038d33f9e")
    public static final class MdaTypes {
        @objid ("b5187e7c-8a14-4c57-954d-05f699e71ce3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e465996e-d8ec-4d0e-a3aa-3d03e9ce36be")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("5f8e6047-fffa-4494-8792-0db5a6d3a765")
        public static TagType SPECIFICATION_TAGTYPE_ELT;

        @objid ("e6a968f3-3279-4dec-a3fa-70047b80e569")
        private static Stereotype MDAASSOCDEP;

        @objid ("867b4922-26a0-4ac3-84cd-b9a87473b561")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2db4042f-eceb-4cb7-9e7b-4d3b5b053f38")
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
