/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.securitymodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << SecurityMetricInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("db549854-9aae-4283-9b11-2038f1326191")
public class SecurityMetricInstance extends MetricInstance {
<<<<<<< HEAD
    @objid ("3f83ec4b-43a4-401c-b092-da7979d2007a")
=======
    @objid ("f1824748-7e9b-4321-8634-8f0ed61710ee")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "SecurityMetricInstance";

    /**
     * Tells whether a {@link SecurityMetricInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SecurityMetricInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("d359d36f-38a0-4f26-b1de-2444606850dc")
=======
    @objid ("29354b00-2a4c-4605-a311-5ef0a70e3d35")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityMetricInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SecurityMetricInstance >> then instantiate a {@link SecurityMetricInstance} proxy.
     * 
     * @return a {@link SecurityMetricInstance} proxy on the created {@link Instance}.
     */
<<<<<<< HEAD
    @objid ("9d27a365-7aed-45f4-a5ba-7781d4ef61bc")
=======
    @objid ("b77139a2-3520-486a-9012-2cd9471dea9e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SecurityMetricInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityMetricInstance.STEREOTYPE_NAME);
        return SecurityMetricInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SecurityMetricInstance} proxy from a {@link Instance} stereotyped << SecurityMetricInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SecurityMetricInstance} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("0723dfc9-04c4-46cb-b18f-20c1d2d77eb8")
=======
    @objid ("40cc1a47-16b7-4240-85b3-fc4a8288ace8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SecurityMetricInstance instantiate(final Instance obj) {
        return SecurityMetricInstance.canInstantiate(obj) ? new SecurityMetricInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityMetricInstance} proxy from a {@link Instance} stereotyped << SecurityMetricInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SecurityMetricInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("7907e2c3-016e-4e6f-91f8-bf7a5278e2a9")
=======
    @objid ("80c65d9b-1eb6-4f81-ba31-489523f8e9e1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SecurityMetricInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SecurityMetricInstance.canInstantiate(obj))
        	return new SecurityMetricInstance(obj);
        else
        	throw new IllegalArgumentException("SecurityMetricInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("64e07a08-29ea-42c4-b038-9cf80d0ea633")
=======
    @objid ("a0c03f53-e9c8-4922-8bc9-2d490a3a7c01")
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
        SecurityMetricInstance other = (SecurityMetricInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("26a61a6e-5035-4274-a6c0-8808876bfde6")
=======
    @objid ("c6d142e4-0942-4462-bb0f-5931e5324dab")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

<<<<<<< HEAD
    @objid ("f0bd97bb-a752-4df0-bd49-42a5a65e5975")
=======
    @objid ("00f7b252-0622-467b-b031-b61c33e7e32f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("289e8f41-bb29-4030-a35d-cfd36d96fdd7")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("337d5a72-c35b-4a88-959a-382362f26e73")
=======
    @objid ("62945a17-15e1-47d5-9fc9-9aeb14f20993")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected SecurityMetricInstance(final Instance elt) {
        super(elt);
    }

    @objid ("91cf5d57-7dbc-49f4-b2a7-30e61c6807c9")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("860a9a64-c992-48de-9578-1fae614e8df7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6f158419-c693-4140-a525-8f91f6fcb2cd")
        private static Stereotype MDAASSOCDEP;

        @objid ("740368f6-1641-466c-b435-f93d6bb7ae10")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2b4a9ee6-70a8-4c20-9b4e-4231677fe277")
=======
        @objid ("00a469d9-fc63-4e4c-b79c-236c2d5732d8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1406e903-2d14-4ca4-8461-28b7dbc12c9a")
        private static Stereotype MDAASSOCDEP;

        @objid ("82681baa-31de-405b-a095-fb8382ed78e3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("13d26e99-e5c5-4cb8-97d3-5fa8f2e58f45")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4cb7cfa4-64dc-42a4-9178-af3560cfcf40");
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
