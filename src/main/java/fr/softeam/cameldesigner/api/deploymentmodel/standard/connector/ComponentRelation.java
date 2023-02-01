/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.connector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.connector.FeatureConnector;
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
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Connector} with << ComponentRelation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("3fb63318-f18c-4336-85d0-330dbedebdfb")
public abstract class ComponentRelation extends FeatureConnector {
<<<<<<< HEAD
    @objid ("81034ae6-4a31-4d21-8df0-d34b3eee804e")
=======
    @objid ("53d795e8-5a8f-41a9-8a15-a3ae05a31acd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "ComponentRelation";

    /**
     * Tells whether a {@link ComponentRelation proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << ComponentRelation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("a81f7eaa-e6cf-436a-ae29-45c399156b30")
=======
    @objid ("8d598d41-545f-4fc0-8457-075b763f41fe")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ComponentRelation.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("746362ab-998f-46c7-9282-eeb667be9e2b")
=======
    @objid ("aa28d63d-5111-4ce6-ba2d-e9aa306a9250")
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
        ComponentRelation other = (ComponentRelation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("1775a4f7-389c-4cb1-b318-3903693a8fb2")
=======
    @objid ("7b74cfd0-5869-4065-a59e-a56201e0a841")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

<<<<<<< HEAD
    @objid ("c8430239-701a-43f0-86ae-6ed0fdd78592")
=======
    @objid ("2e8edccf-a7cd-4538-a1db-123f9d248bfc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("72604249-970a-4160-b83f-e037c6d5791d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("7d26683e-5083-4549-8826-1d64f9e53daf")
=======
    @objid ("a093c1dd-ed70-43b8-ae3d-e951bf720cb5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ComponentRelation(final Connector elt) {
        super(elt);
    }

    @objid ("f7e7dc75-93fe-4f68-8a5c-196b34e1a102")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("c8c9b566-df2d-42c6-a027-90431dc9b498")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2f5bdc82-103e-4631-acf3-f95f7de98ba8")
        private static Stereotype MDAASSOCDEP;

        @objid ("2513a7a1-5d92-4218-b316-576f086008c0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("465dc57d-f0cd-4842-bcb6-c7fcd3c69a20")
=======
        @objid ("2147ab89-8fa3-4ac6-8e75-48f87efc9b1d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("21140c1b-e850-4351-8fb5-ecba712e34f0")
        private static Stereotype MDAASSOCDEP;

        @objid ("0a303b08-462d-4448-9551-937be4f73d08")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9699e87a-166d-476a-b170-818ce88e6067")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1c00d806-f009-48a9-a7de-3f1e462818d1");
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
