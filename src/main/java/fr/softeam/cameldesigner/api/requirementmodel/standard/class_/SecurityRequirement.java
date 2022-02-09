/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl;
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
 * Proxy class to handle a {@link Class} with << SecurityRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6b8aa5ee-f997-4cf1-b7ce-1eb33e152b7e")
public class SecurityRequirement extends HardRequirement {
    @objid ("5cf07380-0170-41e8-b98a-a5a470e4749c")
    public static final String STEREOTYPE_NAME = "SecurityRequirement";

    /**
     * Tells whether a {@link SecurityRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1d21d81b-d114-4c16-9dfb-f7a5a52c75f5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityRequirement >> then instantiate a {@link SecurityRequirement} proxy.
     * 
     * @return a {@link SecurityRequirement} proxy on the created {@link Class}.
     */
    @objid ("f9210796-71cc-4d3b-820e-ab3518ced0cd")
    public static SecurityRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityRequirement.STEREOTYPE_NAME);
        return SecurityRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SecurityRequirement} proxy from a {@link Class} stereotyped << SecurityRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link SecurityRequirement} proxy or <i>null</i>.
     */
    @objid ("984fdfd1-895e-4b61-9c89-a1bfd3349a97")
    public static SecurityRequirement instantiate(final Class obj) {
        return SecurityRequirement.canInstantiate(obj) ? new SecurityRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityRequirement} proxy from a {@link Class} stereotyped << SecurityRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link SecurityRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1c92c51a-6abc-40a5-80aa-59c9773f30a7")
    public static SecurityRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SecurityRequirement.canInstantiate(obj))
        	return new SecurityRequirement(obj);
        else
        	throw new IllegalArgumentException("SecurityRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'securityControls' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ff1fd484-a38b-4191-b533-3ca1c5d0b309")
    public void addSecurityControls(final SecurityControl obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SecurityRequirement.MdaTypes.MDAASSOCDEP);
            d.setName("securityControls");
            d.putTagValue(SecurityRequirement.MdaTypes.MDAASSOCDEP_ROLE, "securityControls");
        }
    }

    @objid ("889a54fe-c0e8-4513-b268-6e16d73506cb")
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
        SecurityRequirement other = (SecurityRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("6e5b3fd4-79e6-430f-8189-48852e516832")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'securityControls' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8259be9c-934c-4bd0-8585-87ab76ec3cb4")
    public List<SecurityControl> getSecurityControls() {
        List<SecurityControl> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(SecurityRequirement.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SecurityRequirement.MdaTypes.MDAASSOCDEP_ROLE), "securityControls")
              && SecurityControl.canInstantiate(d.getDependsOn()))
                results.add((SecurityControl)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityControl.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ac9ae133-8551-4f04-8f67-22b634778920")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'securityControls' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b3142306-4f5e-40d2-b00b-290cc838696f")
    public boolean removeSecurityControls(final SecurityControl obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SecurityRequirement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityRequirement.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("5a01c461-0606-42df-8e09-44bce4cc0c4a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("7094a425-f03e-4739-9af7-f8483cb844d4")
    protected SecurityRequirement(final Class elt) {
        super(elt);
    }

    @objid ("9b57abca-226e-4023-b549-3dc9186ae82b")
    public static final class MdaTypes {
        @objid ("a2e91cd4-a2de-4cea-9738-53247b665030")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("64a80b68-6a4a-4489-8cee-98293245b00d")
        private static Stereotype MDAASSOCDEP;

        @objid ("05841717-eff0-4adc-afe4-9b555f52c520")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1bef2d05-ccd2-4ac7-a95d-7d5d8735033f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c104b35e-2578-4138-94df-ff26daad8dc7");
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
