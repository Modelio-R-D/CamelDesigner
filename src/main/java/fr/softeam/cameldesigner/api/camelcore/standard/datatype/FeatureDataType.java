/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("427b36f0-688a-47ab-b0ff-08559bf10594")
    public static final String STEREOTYPE_NAME = "Feature_DataType";

    /**
     * Tells whether a {@link FeatureDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Feature_DataType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1beed202-d951-477c-957a-1c7650306f02")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << Feature_DataType >> then instantiate a {@link FeatureDataType} proxy.
     * 
     * @return a {@link FeatureDataType} proxy on the created {@link DataType}.
     */
    @objid ("3155c43b-b359-411a-aa9b-2b16ce71c950")
    public static FeatureDataType create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeatureDataType.STEREOTYPE_NAME);
        return FeatureDataType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link FeatureDataType} proxy from a {@link DataType} stereotyped << Feature_DataType >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a DataType
     * @return a {@link FeatureDataType} proxy or <i>null</i>.
     */
    @objid ("f62beb4c-a752-42a7-b597-43d8a3cfece2")
    public static FeatureDataType instantiate(final DataType obj) {
        return FeatureDataType.canInstantiate(obj) ? new FeatureDataType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureDataType} proxy from a {@link DataType} stereotyped << Feature_DataType >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link DataType}
     * @return a {@link FeatureDataType} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bee828aa-7635-4f3a-a2c6-3958bcbc1e18")
    public static FeatureDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (FeatureDataType.canInstantiate(obj))
            return new FeatureDataType(obj);
        else
            throw new IllegalArgumentException("FeatureDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("352ff0f9-0e77-4711-b812-d923d57da8f7")
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
     * 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("3ee525b1-d2f9-44c7-8cf5-3fda67620a71")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("c764d66b-0602-48aa-b079-6232418fe4c4")
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

    @objid ("51628291-13e3-40e2-a684-dde130936508")
    protected FeatureDataType(final DataType elt) {
        super(elt);
    }

    @objid ("70c8de77-0287-43e4-850d-c6ebd3c36717")
    public static final class MdaTypes {
        @objid ("b8738ae1-25dd-4cd4-a564-d0e0af06dc00")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8abd528b-da42-4f16-b24f-5b4d71329b9a")
        private static Stereotype MDAASSOCDEP;

        @objid ("680763b3-7129-4f3c-b16c-ac5205f9fb05")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e8e2d0d8-8da7-45e6-ab8c-e01f1d27f4db")
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
