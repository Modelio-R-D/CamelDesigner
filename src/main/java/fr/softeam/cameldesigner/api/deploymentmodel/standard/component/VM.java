/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.component;

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
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Component} with << VM >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7ab7afe3-013e-4c06-af79-866889291e60")
public class VM extends CamelComponent {
<<<<<<< HEAD
    @objid ("f8c4b490-5efa-4658-82aa-fd6f254a09e0")
=======
    @objid ("c484120d-534a-41ea-abe9-09350d46108e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "VM";

    /**
     * Tells whether a {@link VM proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << VM >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("4fbc1219-70ac-491a-8588-91322baabf6c")
=======
    @objid ("c16dc0b7-2676-4d8b-b836-8e78501d4dd7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VM.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << VM >> then instantiate a {@link VM} proxy.
     * 
     * @return a {@link VM} proxy on the created {@link Component}.
     */
<<<<<<< HEAD
    @objid ("ad7d77a8-b5eb-4bec-8b61-82d93e49503d")
=======
    @objid ("4098aaf2-2f53-4652-a241-0073010d3e58")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static VM create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Component");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, VM.STEREOTYPE_NAME);
        return VM.instantiate((Component)e);
    }

    /**
     * Tries to instantiate a {@link VM} proxy from a {@link Component} stereotyped << VM >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Component
     * @return a {@link VM} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("00c99cf3-04a1-419e-9ff4-cfd94ff27ae5")
=======
    @objid ("3e24996a-69c0-4b79-921e-5d3e3a5b71d8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static VM instantiate(final Component obj) {
        return VM.canInstantiate(obj) ? new VM(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VM} proxy from a {@link Component} stereotyped << VM >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Component}
     * @return a {@link VM} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("e3ca3f79-197c-42f5-b109-c2c1db9b9cc0")
=======
    @objid ("2eb5cadf-a311-49e4-b83b-f97c53048d07")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static VM safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (VM.canInstantiate(obj))
        	return new VM(obj);
        else
        	throw new IllegalArgumentException("VM: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("e58c9ba3-2ac7-4b0a-97ee-f3645da889eb")
=======
    @objid ("8184c4f9-9aca-4e75-ace8-953122ffea35")
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
        VM other = (VM) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Component}. 
     * @return the Component represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("b42c398a-f448-4d20-bab2-3c56a73fb51e")
=======
    @objid ("e5f6df9f-4ff9-4b3c-9db4-b1528941d186")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

<<<<<<< HEAD
    @objid ("af98f83a-7a18-4ce6-aead-b7a7727429f4")
=======
    @objid ("85b29a2c-0a3d-4cda-9617-cfe11b1b3994")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ea65bd8d-d54f-4550-94b4-a0c91a2ea081")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("49d89f78-291c-4be0-a314-d3f7c4cd97ed")
=======
    @objid ("bb66b9c5-a780-4e35-89e3-98e3062b3358")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected VM(final Component elt) {
        super(elt);
    }

    @objid ("b498c9c3-0245-4fb1-97a6-fbac3113e3fd")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("23952507-85be-4667-a9b0-f293c7e5e557")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f353fcf2-5c2f-4003-9673-e1a206b50fe5")
        private static Stereotype MDAASSOCDEP;

        @objid ("0417ca6a-d436-4c19-b7bc-be1f4a5dfaef")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8010dcd6-880e-4942-b322-6f410905dfa8")
=======
        @objid ("769cf51a-0643-4594-9954-c76c3c4ec49e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f9ad521e-b17e-4ad9-803e-075fc8b9bd91")
        private static Stereotype MDAASSOCDEP;

        @objid ("4ca5782f-bb8e-4ac6-bede-6ecb8663396b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("864c2338-0f14-4bea-84b6-d06aec2d1556")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8bd1ea8d-6714-4a3b-9da9-c914064d8440");
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
