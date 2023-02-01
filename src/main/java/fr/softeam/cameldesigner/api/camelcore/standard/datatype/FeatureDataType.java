/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.camelcore.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.classifier.FeatureClassifier;
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
 * Proxy class to handle a {@link DataType} with << Feature_DataType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fb49805b-f839-4291-96a7-e27350a2a19b")
public class FeatureDataType extends FeatureClassifier {
<<<<<<< HEAD
    @objid ("eca80100-2473-4935-b1d0-e60c91ca7526")
=======
    @objid ("8b63bb6a-ec02-46a1-a8ef-43568f9364ff")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Feature_DataType";

    /**
     * Tells whether a {@link FeatureDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Feature_DataType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("dac761ad-91bc-49d3-8cd7-7e87ef8269ff")
=======
    @objid ("6f410592-489b-40a3-8818-f1ab73f27a8f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << Feature_DataType >> then instantiate a {@link FeatureDataType} proxy.
     * 
     * @return a {@link FeatureDataType} proxy on the created {@link DataType}.
     */
<<<<<<< HEAD
    @objid ("66037cf5-a415-4633-962d-558f4711268a")
=======
    @objid ("bf28dc88-1e59-4774-aa6d-a37f47486ac4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeatureDataType create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeatureDataType.STEREOTYPE_NAME);
        return FeatureDataType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link FeatureDataType} proxy from a {@link DataType} stereotyped << Feature_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link FeatureDataType} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("deeac3f2-9edb-4d67-967f-b662d5320629")
=======
    @objid ("dc9494dc-01e9-43c3-9e64-77b3f4ab51a4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeatureDataType instantiate(final DataType obj) {
        return FeatureDataType.canInstantiate(obj) ? new FeatureDataType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureDataType} proxy from a {@link DataType} stereotyped << Feature_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link FeatureDataType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("57024a4c-79aa-41e9-a51c-8fce3ca0258a")
=======
    @objid ("2515cfa4-20a3-4df4-9f25-98a61f7a13ba")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeatureDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (FeatureDataType.canInstantiate(obj))
        	return new FeatureDataType(obj);
        else
        	throw new IllegalArgumentException("FeatureDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("811c1eb0-d2a7-466a-817c-e286adc0ecc7")
=======
    @objid ("a248d640-abab-4530-9b77-8313774e7d67")
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
        FeatureDataType other = (FeatureDataType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("ad51bdc6-e2fa-4d21-915d-058599b21fdd")
=======
    @objid ("63c7669f-ceb2-4bc2-96ec-70ab1dd84a34")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

<<<<<<< HEAD
    @objid ("feff172f-4563-4865-a956-8424e429d093")
=======
    @objid ("07a31f73-d18d-4788-b9e3-83e8dd57ce0f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d9d6f5ae-de79-44aa-8aaf-945d6a560124")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("f31f858b-31c7-460f-b9af-726f2272a254")
=======
    @objid ("1a2cbbac-193e-4d8c-ac75-24b49f503f49")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected FeatureDataType(final DataType elt) {
        super(elt);
    }

    @objid ("70c8de77-0287-43e4-850d-c6ebd3c36717")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("84daba42-b708-4604-8152-ed87fd8203dd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("540cdc2d-b81c-42b8-8bad-b9abefd88937")
        private static Stereotype MDAASSOCDEP;

        @objid ("37407a05-3e5f-4b25-b82d-2dd36431b5b6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f97045a2-c64a-4f99-b970-72966b0a8575")
=======
        @objid ("0dc721b1-903f-438c-9d86-59abc4d319f7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("063b74e7-c724-4495-a1e0-067121567d5b")
        private static Stereotype MDAASSOCDEP;

        @objid ("364cb91d-f057-4426-94f7-ff6794185538")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("224838e2-4c20-4578-a216-4bd6699c78fd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "eaf56346-fbac-4409-ad4f-4e1a6c4183d1");
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
