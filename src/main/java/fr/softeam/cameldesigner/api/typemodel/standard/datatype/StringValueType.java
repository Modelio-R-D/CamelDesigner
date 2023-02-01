/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.typemodel.standard.datatype;

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
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << StringValueType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d4a116b7-cd26-400c-b04d-1c342f5d5ece")
public class StringValueType extends ValueType {
<<<<<<< HEAD
    @objid ("81021b60-4538-4443-8bca-9817a0c7e0ee")
=======
    @objid ("f9dd4b14-16cb-437d-92b0-f092236bb82b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "StringValueType";

    /**
     * Tells whether a {@link StringValueType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << StringValueType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("510b88b3-5ad6-49a0-b272-9d89f795daa9")
=======
    @objid ("49f5fad0-5045-4004-b4bb-8c2d5a6daf43")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, StringValueType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << StringValueType >> then instantiate a {@link StringValueType} proxy.
     * 
     * @return a {@link StringValueType} proxy on the created {@link DataType}.
     */
<<<<<<< HEAD
    @objid ("a9a01782-8d02-4db2-975c-8320d7bf02fc")
=======
    @objid ("63b14df3-e66e-4617-b71b-ea1e000e5bf6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static StringValueType create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, StringValueType.STEREOTYPE_NAME);
        return StringValueType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link StringValueType} proxy from a {@link DataType} stereotyped << StringValueType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link StringValueType} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("20961d53-b190-4b37-8383-62fdd67eb004")
=======
    @objid ("8a29c9f8-52a6-47e5-b1ec-b9593830994d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static StringValueType instantiate(final DataType obj) {
        return StringValueType.canInstantiate(obj) ? new StringValueType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StringValueType} proxy from a {@link DataType} stereotyped << StringValueType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link StringValueType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("ca47da0c-b9b5-4afe-b01d-2f1bb2bf17bf")
=======
    @objid ("0e637f1d-adbc-46c3-b641-584c164de4fa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static StringValueType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (StringValueType.canInstantiate(obj))
        	return new StringValueType(obj);
        else
        	throw new IllegalArgumentException("StringValueType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("8ea2080c-61cb-4a77-aef5-3eaf473b9c0b")
=======
    @objid ("feafd916-c1b9-462a-8c7a-7359f50aa81b")
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
        StringValueType other = (StringValueType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("349ab37b-b77c-4169-bf41-06cb4db254a1")
=======
    @objid ("7c8ed80d-e46c-40d7-b1eb-963285e12282")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

<<<<<<< HEAD
    @objid ("3b5a8f40-a24b-40d8-8632-6a1b6ea5015b")
=======
    @objid ("89edfbbe-3aea-4cc1-88a5-df7080d64ab0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("417f82d6-6bb2-4286-b0d2-8b32d70fe465")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("8d7e05ba-54d4-4c1b-9a92-a59675a7da1e")
=======
    @objid ("fc9b71e4-b821-48c4-b259-af882711fa2e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected StringValueType(final DataType elt) {
        super(elt);
    }

    @objid ("a89d3bdc-f18a-481f-8114-f08ae25840a6")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("d4cbb1e6-2913-439f-8695-ed3774b738ca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("06ba4a82-fa85-40b2-bae5-982697bf5f47")
        private static Stereotype MDAASSOCDEP;

        @objid ("6beac043-35cb-4992-b887-d604c94a9cf5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("16e3cdd1-b57f-4936-a8d5-dd8187462a79")
=======
        @objid ("38bce541-99db-4836-972a-4ed463d3f78b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6b5a33b7-2e5c-4dd3-8de4-2db74e5a162b")
        private static Stereotype MDAASSOCDEP;

        @objid ("5568a833-ba51-4dd2-bdb0-27af47bdcbaf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("effd8223-0a84-4e89-a2fd-58096fbf149b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c8a2299c-93cc-47ca-82f3-53c1866d2c5b");
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
