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
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric;
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
 * Proxy class to handle a {@link Class} with << CompositeSecurityMetric >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1f0a6163-1b92-4d1e-9b82-465f58ed0d66")
public class CompositeSecurityMetric extends CompositeMetric {
<<<<<<< HEAD
    @objid ("793c01c2-6604-4237-9c11-aee4f3723b73")
=======
    @objid ("11351c96-4b1f-45a3-907f-cb7b06da672d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "CompositeSecurityMetric";

    /**
     * Tells whether a {@link CompositeSecurityMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CompositeSecurityMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("a33756c8-a2ed-412b-b932-25b4cd155e7c")
=======
    @objid ("21cf7bfd-2a8a-4b08-8f08-5bd17279d958")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeSecurityMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CompositeSecurityMetric >> then instantiate a {@link CompositeSecurityMetric} proxy.
     * 
     * @return a {@link CompositeSecurityMetric} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("cf74b785-3b21-441a-a5d6-c34e882dcc94")
=======
    @objid ("ae39108e-b083-4e66-b71b-9e356fee44cb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CompositeSecurityMetric create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CompositeSecurityMetric.STEREOTYPE_NAME);
        return CompositeSecurityMetric.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CompositeSecurityMetric} proxy from a {@link Class} stereotyped << CompositeSecurityMetric >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CompositeSecurityMetric} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("31267e08-7704-450c-88e3-5f7024cd279f")
=======
    @objid ("1aaabf36-ff9a-496f-a53f-17c0a74fcbf5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CompositeSecurityMetric instantiate(final Class obj) {
        return CompositeSecurityMetric.canInstantiate(obj) ? new CompositeSecurityMetric(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CompositeSecurityMetric} proxy from a {@link Class} stereotyped << CompositeSecurityMetric >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CompositeSecurityMetric} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("c496ff87-1cdb-42c3-b040-9633da50b268")
=======
    @objid ("d4a5a7bc-3f65-43cd-b380-ce13c4b511ff")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CompositeSecurityMetric safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CompositeSecurityMetric.canInstantiate(obj))
        	return new CompositeSecurityMetric(obj);
        else
        	throw new IllegalArgumentException("CompositeSecurityMetric: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("520cad1b-1715-4ca9-bc85-35acc0b18696")
=======
    @objid ("a585c357-4c54-480a-abb2-f0c15ff48ac6")
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
        CompositeSecurityMetric other = (CompositeSecurityMetric) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'domain' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("77484553-2592-4aee-98ba-de472196ddb2")
=======
    @objid ("c860d0c4-d97a-4eee-b731-d9e15d6d3460")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public SecurityDomain getDomain() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CompositeSecurityMetric.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CompositeSecurityMetric.MdaTypes.MDAASSOCDEP_ROLE), "domain")){
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
    @objid ("e7255811-12db-49d0-a3a8-5b60d1105c75")
=======
    @objid ("28f47276-31be-4d9d-b1f7-5ce0d096d897")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("61853d13-3b52-427b-bdea-104ae1a821b4")
=======
    @objid ("3096cee8-3a0d-481f-b2f5-425704189376")
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
    @objid ("80d956f5-ab80-4654-97ec-3bde4c4e6be7")
=======
    @objid ("2c1e7c30-4b21-400e-8332-63372e5b7086")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setDomain(final SecurityDomain obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(CompositeSecurityMetric.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CompositeSecurityMetric.MdaTypes.MDAASSOCDEP_ROLE), "domain")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), CompositeSecurityMetric.MdaTypes.MDAASSOCDEP);
              dep.setName("domain");      dep.putTagValue(CompositeSecurityMetric.MdaTypes.MDAASSOCDEP_ROLE, "domain");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("28a4a4be-416e-4e9e-bf1b-fe85bbdf6b0d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("8fbe8f32-9976-4281-b2c5-a25b350e2423")
=======
    @objid ("c383d199-7f96-4a6b-9565-6705d50bdcb7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected CompositeSecurityMetric(final Class elt) {
        super(elt);
    }

    @objid ("fe4cd5da-e95c-488c-a4aa-bd4e00428eda")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("425dcb8e-cdfd-4e5d-a251-7ae4ae30bd0c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f3c06d1b-a57c-4de3-a5a1-f216f0acf71a")
        private static Stereotype MDAASSOCDEP;

        @objid ("c1f10f08-5f10-4fae-bb80-d1b09648b007")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b8added6-b240-4335-9827-57ba24e13b00")
=======
        @objid ("4d545315-3a14-4fb7-8869-bab7db7db128")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1d8cc5b8-6a64-49dd-8bd9-a5b4b8b82b01")
        private static Stereotype MDAASSOCDEP;

        @objid ("0512c02a-a58c-4628-ae74-b2f823b0c436")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7aa0bc04-3fc9-4f29-adaa-1009f09094df")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "49dfe43f-0fa8-476b-a6ba-03b62463e361");
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
