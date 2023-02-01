/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.cameldiagrams.infrastructure.abstractdiagram.AbstractCamelDiagram;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ClassDiagram} with << ExecutionModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("81054f40-4a19-4bee-8959-d5f552c3e112")
public class ExecutionModelDiagram extends AbstractCamelDiagram {
<<<<<<< HEAD
    @objid ("d8e566d4-ceca-4052-84c2-eedbc1bc10f2")
=======
    @objid ("deb83b10-10b0-4106-9f3e-af5a2aebdb86")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "ExecutionModelDiagram";

    /**
     * Tells whether a {@link ExecutionModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << ExecutionModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("8c325302-6183-4086-affa-cf50889dd790")
=======
    @objid ("65ccb92a-fdfd-4e5a-836f-ef99742752d3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExecutionModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << ExecutionModelDiagram >> then instantiate a {@link ExecutionModelDiagram} proxy.
     * 
     * @return a {@link ExecutionModelDiagram} proxy on the created {@link ClassDiagram}.
     */
<<<<<<< HEAD
    @objid ("30a13cfa-ed27-467a-9037-f7a5fc358e3e")
=======
    @objid ("579acd31-c92c-4273-af7d-d47ca26bacb5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ExecutionModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ExecutionModelDiagram.STEREOTYPE_NAME);
        return ExecutionModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link ExecutionModelDiagram} proxy from a {@link ClassDiagram} stereotyped << ExecutionModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link ExecutionModelDiagram} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("f58539c7-b153-4f1a-82d5-6e933b0c36ca")
=======
    @objid ("f71223cc-635d-4584-b917-723f10a29477")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ExecutionModelDiagram instantiate(final ClassDiagram obj) {
        return ExecutionModelDiagram.canInstantiate(obj) ? new ExecutionModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ExecutionModelDiagram} proxy from a {@link ClassDiagram} stereotyped << ExecutionModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link ExecutionModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("4022288a-9ce8-4f34-a4c0-e80d7918a68a")
=======
    @objid ("661a2533-fcf8-4bbd-9852-81161959b691")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ExecutionModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (ExecutionModelDiagram.canInstantiate(obj))
        	return new ExecutionModelDiagram(obj);
        else
        	throw new IllegalArgumentException("ExecutionModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("06609364-2ed6-4396-bd37-b9d92f499876")
=======
    @objid ("4b0ca441-f407-4b2b-89bb-911af15b88e5")
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
        ExecutionModelDiagram other = (ExecutionModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("b24567a6-df21-47cb-99f0-ed234c13dd9f")
=======
    @objid ("293aa7c7-c08d-4c05-8af9-a357bb786c08")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    /**
     * Get the value to the 'Origin' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("8dc41ab7-0deb-4c0c-ae41-af60787b22c9")
=======
    @objid ("0cf62b9a-0f67-451d-b9b3-7195b8b7f3ae")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public ExecutionModel getOrigin() {
        return (ExecutionModel)CamelDesignerProxyFactory.instantiate(((ClassDiagram) this.elt).getOrigin(), ExecutionModel.STEREOTYPE_NAME);
    }

<<<<<<< HEAD
    @objid ("b9ec6b75-feb4-4fd9-ba29-9bc0f50c45da")
=======
    @objid ("91d9af84-0532-49da-ab59-e08c92253ece")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'Origin' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a1ca8d8b-db97-4a22-8023-834dc93ae311")
=======
    @objid ("de77c941-3884-4a0a-bab4-82e668c0c0c2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setOrigin(final ExecutionModel obj) {
        ((ClassDiagram) this.elt).setOrigin((obj != null) ? obj.getElement() : null);
    }

    @objid ("2f80f04c-df61-48c6-9945-4f635ce676b9")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

<<<<<<< HEAD
    @objid ("daa956bf-08e4-485f-9159-8784eebb753d")
=======
    @objid ("385a4580-f830-4a6d-b784-ff06397c1fd9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ExecutionModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("ab4c82f7-565e-4087-a077-3c41552a0525")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("90725722-c093-474b-9aeb-cb874bf1c355")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("592618fc-9e82-4cbd-b28e-ddaab2db8e6e")
        private static Stereotype MDAASSOCDEP;

        @objid ("973fabe6-6954-42ff-85ae-cd5fab7f2047")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8fc7f884-4a76-4c5b-a392-d55d05250e5c")
=======
        @objid ("45cb4fb3-4424-429f-b6d2-657d05ff9d02")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2cf1de5b-15ef-4e42-819c-b668d54140fb")
        private static Stereotype MDAASSOCDEP;

        @objid ("8ca17954-0fd4-4b3f-a85f-14f0bc2af99c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d32ac5ad-271b-4eef-8a35-659e1a192b8b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "40a6ab6a-6df9-40b0-a877-d1de85918a7d");
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
