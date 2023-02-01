/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric;
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
 * Proxy class to handle a {@link Class} with << RawSecurityMetric >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9c9c3717-d929-40e5-883e-acf25d0cc102")
public class RawSecurityMetric extends RawMetric {
<<<<<<< HEAD
    @objid ("07fea46c-40ed-43cf-b84a-e4a4b7fb8da7")
=======
    @objid ("032db283-7e24-4fe0-93bb-ecd1d4ff4d01")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "RawSecurityMetric";

    /**
     * Tells whether a {@link RawSecurityMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RawSecurityMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("8fe5d306-04b0-4728-9d3a-7158062d0171")
=======
    @objid ("3a6fee0c-5c4a-48ec-89c6-50e31a00787a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RawSecurityMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RawSecurityMetric >> then instantiate a {@link RawSecurityMetric} proxy.
     * 
     * @return a {@link RawSecurityMetric} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("9a0989a8-02b6-4991-978c-2287023fa63a")
=======
    @objid ("9ed26ddf-00de-4793-8936-4f4225df9e6e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static RawSecurityMetric create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RawSecurityMetric.STEREOTYPE_NAME);
        return RawSecurityMetric.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RawSecurityMetric} proxy from a {@link Class} stereotyped << RawSecurityMetric >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RawSecurityMetric} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("aaac5646-6160-4f1f-9934-222c4d6ec45d")
=======
    @objid ("e3f1e90f-72f8-49cd-aa8a-c2eee424b84a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static RawSecurityMetric instantiate(final Class obj) {
        return RawSecurityMetric.canInstantiate(obj) ? new RawSecurityMetric(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RawSecurityMetric} proxy from a {@link Class} stereotyped << RawSecurityMetric >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RawSecurityMetric} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("0a56f16b-458d-4cc5-bb42-510cec003188")
=======
    @objid ("6ee95ec5-b10b-4481-bbe0-5400afb254c8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static RawSecurityMetric safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RawSecurityMetric.canInstantiate(obj))
        	return new RawSecurityMetric(obj);
        else
        	throw new IllegalArgumentException("RawSecurityMetric: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("933419c5-e437-4982-93e4-c6057854eeee")
=======
    @objid ("e6f583a1-8486-45c2-8591-ea4a658b619d")
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
        RawSecurityMetric other = (RawSecurityMetric) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'domain' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("70ebb135-19ce-44e8-bae3-569d323e6308")
=======
    @objid ("ba7e3591-cd0b-49cc-8960-58c49136fafe")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public SecurityDomain getDomain() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RawSecurityMetric.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RawSecurityMetric.MdaTypes.MDAASSOCDEP_ROLE), "domain")){
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
<<<<<<< HEAD
    @objid ("aded04cc-0574-4e74-8d5d-8d03d9019705")
=======
    @objid ("097e9c86-58ec-4489-a85f-d2ed0a1af040")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("082a83c2-b805-4127-9ccf-06bcc62f9fa7")
=======
    @objid ("a5c62e99-68a2-47ee-a598-f6a08dc7a325")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'domain' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("33f93bc7-bffa-4ae2-a925-d38f716cde60")
=======
    @objid ("febc9818-a063-4856-9e33-cb2e4b34157f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setDomain(final SecurityDomain obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RawSecurityMetric.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RawSecurityMetric.MdaTypes.MDAASSOCDEP_ROLE), "domain")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RawSecurityMetric.MdaTypes.MDAASSOCDEP);
              dep.setName("domain");      dep.putTagValue(RawSecurityMetric.MdaTypes.MDAASSOCDEP_ROLE, "domain");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("ecb47660-a285-41e8-8d25-20503f2f13f6")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("cc1cb085-4678-4aa0-9d72-1407f65566da")
=======
    @objid ("00673a23-0a8d-4f57-a4e5-26e6833d1e51")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected RawSecurityMetric(final Class elt) {
        super(elt);
    }

    @objid ("e07ed229-3645-4f01-84db-5816474f36ad")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("90394fc1-8c10-47b2-bda1-4cd210b89cb1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c51a221c-7e7f-49e4-9cdf-4fb73857f00d")
        private static Stereotype MDAASSOCDEP;

        @objid ("a856bd84-cec4-4c12-b918-5f20744e8fbc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0942fd94-1117-4590-8af4-37d97ed863eb")
=======
        @objid ("0f82f332-3742-473b-b474-35c198e75331")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1fa666c8-3a4f-476f-b30a-7f77633e4aaa")
        private static Stereotype MDAASSOCDEP;

        @objid ("2aa53c84-4f6c-496f-a088-0c145b9e2120")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("68d8a1e3-6d7e-40bb-94cb-7e31af845796")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01bb4068-95c3-463c-bfc3-5e98fbd8bf98");
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
