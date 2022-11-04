/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective;
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
 * Proxy class to handle a {@link Class} with << SecuritySLO >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("14701eb6-66e6-421f-bc02-e050f9e15799")
public class SecuritySLO extends ServiceLevelObjective {
    @objid ("03ea2587-b6af-411c-b041-333f4fcedea2")
    public static final String STEREOTYPE_NAME = "SecuritySLO";

    /**
     * Tells whether a {@link SecuritySLO proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecuritySLO >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("03a8eaca-1973-41e9-8187-97ccc410fe9b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecuritySLO.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecuritySLO >> then instantiate a {@link SecuritySLO} proxy.
     * 
     * @return a {@link SecuritySLO} proxy on the created {@link Class}.
     */
    @objid ("544e9104-e5b7-410b-9264-994bfa56deb8")
    public static SecuritySLO create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecuritySLO.STEREOTYPE_NAME);
        return SecuritySLO.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SecuritySLO} proxy from a {@link Class} stereotyped << SecuritySLO >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link SecuritySLO} proxy or <i>null</i>.
     */
    @objid ("74f542c4-e994-4f60-804a-d45fe267dc76")
    public static SecuritySLO instantiate(final Class obj) {
        return SecuritySLO.canInstantiate(obj) ? new SecuritySLO(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecuritySLO} proxy from a {@link Class} stereotyped << SecuritySLO >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link SecuritySLO} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2fdf192b-fabf-460e-8279-5f675afedc83")
    public static SecuritySLO safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SecuritySLO.canInstantiate(obj))
        	return new SecuritySLO(obj);
        else
        	throw new IllegalArgumentException("SecuritySLO: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9f406000-594a-4974-ae0d-df27839b5293")
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
        SecuritySLO other = (SecuritySLO) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("d2fdaa73-2d69-4ec7-8722-611bcbd9313b")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("4709f081-0e8d-46e4-969c-afa0bf2f323c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0884089d-11ac-40cf-865e-45d813d66936")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("d3afaa59-3f23-4cf5-bbba-6e27cf3b5d58")
    protected SecuritySLO(final Class elt) {
        super(elt);
    }

    @objid ("617e4bcc-2615-4bc6-b9f6-51075bd242b2")
    public static final class MdaTypes {
        @objid ("5c8f12a1-f8ae-4502-b772-cda9694ced8c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("424eedcb-1b80-443f-b8c0-9b71e5330b5b")
        private static Stereotype MDAASSOCDEP;

        @objid ("f8bec446-facf-4b6a-a0ec-ae4643ff12fb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ac9fec85-b9f6-4748-aa72-0a1b87f8b4d1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8fcb0a39-47f5-4d53-9540-bede515f2431");
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
