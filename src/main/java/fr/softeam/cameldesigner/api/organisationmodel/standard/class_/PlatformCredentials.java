/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << PlatformCredentials >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("071d211c-2384-4a4a-8cac-c38f32bd4c25")
public class PlatformCredentials extends Credentials {
<<<<<<< HEAD
    @objid ("f6851855-d809-4d1f-9196-131f34336c12")
    public static final String STEREOTYPE_NAME = "PlatformCredentials";

    @objid ("45a5947c-a4e9-4c12-a805-60fea8c6c21d")
=======
    @objid ("a375b742-046e-4e15-aa10-22ded4e071e1")
    public static final String STEREOTYPE_NAME = "PlatformCredentials";

    @objid ("893cd755-d0c4-412f-9954-bef11a511ed0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String PASSWORD_TAGTYPE = "password";

    /**
     * Tells whether a {@link PlatformCredentials proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PlatformCredentials >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("75c1f229-d5f4-4b25-8075-f2a97c9f6a01")
=======
    @objid ("56c12417-dbb2-491b-88a9-0195f4a2b668")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PlatformCredentials.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << PlatformCredentials >> then instantiate a {@link PlatformCredentials} proxy.
     * 
     * @return a {@link PlatformCredentials} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("883e8798-13d1-4d9c-8b48-fa93a360fa01")
=======
    @objid ("3446df81-5827-4216-a8b5-eb511bc18275")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static PlatformCredentials create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PlatformCredentials.STEREOTYPE_NAME);
        return PlatformCredentials.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link PlatformCredentials} proxy from a {@link Class} stereotyped << PlatformCredentials >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link PlatformCredentials} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("e58f124f-f760-422d-91ef-ff137a2742d5")
=======
    @objid ("18d6aa1f-bb96-40f4-9ecc-625bf4a73576")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static PlatformCredentials instantiate(final Class obj) {
        return PlatformCredentials.canInstantiate(obj) ? new PlatformCredentials(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PlatformCredentials} proxy from a {@link Class} stereotyped << PlatformCredentials >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link PlatformCredentials} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("57bf2c48-0fb3-4d18-b0f2-f6a3d35af4cb")
=======
    @objid ("0e532762-4291-41b5-b768-a5a490d8d236")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static PlatformCredentials safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PlatformCredentials.canInstantiate(obj))
        	return new PlatformCredentials(obj);
        else
        	throw new IllegalArgumentException("PlatformCredentials: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("e6396d56-c9c6-4ffc-a5ca-e4b83493228c")
=======
    @objid ("8326b7f2-1200-4fb0-9fee-b33fc77b87db")
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
        PlatformCredentials other = (PlatformCredentials) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("e3dd210b-0d76-4172-b0b0-f27355693317")
=======
    @objid ("a1686327-c99c-494a-8c3a-1f1828868efc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("1fcf17f8-9b08-4a01-9f9d-9c0c182c4eba")
=======
    @objid ("9a7c07e4-c794-4418-a13f-b108829b23db")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getPassword() {
        return this.elt.getTagValue(PlatformCredentials.MdaTypes.PASSWORD_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("c93cb689-d518-403e-9ab8-153415dc7f24")
=======
    @objid ("ada06fcd-80d9-4a45-9fd2-ccea6591130e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("bbafda8f-b255-4cbf-bb90-8c884f98764e")
=======
    @objid ("266579f8-5a5f-4ad6-b00c-f59ec1dd6f40")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setPassword(final String value) {
        this.elt.putTagValue(PlatformCredentials.MdaTypes.PASSWORD_TAGTYPE_ELT, value);
    }

    @objid ("21e68a0d-4120-4982-8d10-e16982a3d89f")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("e0018cd5-a8fa-468b-b196-02ad3742d849")
=======
    @objid ("7a49f582-fc19-4271-a7c1-e67e83ec3dfc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected PlatformCredentials(final Class elt) {
        super(elt);
    }

    @objid ("92fe8b7b-826a-496c-8b51-48154e382f82")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("b4ddb11d-4f04-4611-8e78-650d0e4524fb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("019b69d3-e6d1-407c-951b-2d78dd937a20")
        public static TagType PASSWORD_TAGTYPE_ELT;

        @objid ("2224ad3d-c356-42ee-bfde-d246cdddd139")
        private static Stereotype MDAASSOCDEP;

        @objid ("fdcca821-d3b0-40fd-ba21-6903f30cf4a6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("df79b75f-9a25-4b7e-b2a1-61f7d7c1a7c7")
=======
        @objid ("da79b32d-40e1-40d8-8457-67c75ec2dc7d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fb068b5f-b736-4374-9ea7-9a023fc703d4")
        public static TagType PASSWORD_TAGTYPE_ELT;

        @objid ("958744d5-5f12-437b-ab9f-d68a44f25d63")
        private static Stereotype MDAASSOCDEP;

        @objid ("a6bb1e9b-72e3-4055-b41c-9fcf7b05aad9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("291babdc-5ef5-4ff7-a4ee-2dc52c50861a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "18028ade-34c8-4575-802c-163035bf0bb0");
            PASSWORD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "82175de9-34de-4e30-ba3e-d13cdf0653d1");
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
