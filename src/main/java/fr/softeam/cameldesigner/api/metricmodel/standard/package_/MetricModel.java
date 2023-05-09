/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << MetricModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("51d9d8d2-09df-43a4-afb2-46e9551ee43b")
public abstract class MetricModel extends SubModel {
    @objid ("0e40d8b8-4ef8-418d-b050-4749e0e54918")
    public static final String STEREOTYPE_NAME = "MetricModel";

    /**
     * Tells whether a {@link MetricModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetricModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e3a622fe-c967-4594-b02b-50f054abc012")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricModel.STEREOTYPE_NAME));
    }

    @objid ("6f845993-faca-4150-af5f-5c06f6801d0b")
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
        MetricModel other = (MetricModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("82bb72d1-90a8-4805-ac52-1f1ffdc849a8")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("c0dfc71d-0aa5-42b8-8014-c4030769fe39")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fb2e1e36-0961-44ef-9111-df5f02d3922a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("baca04a2-463a-4968-b29c-eaa4e49047b7")
    protected MetricModel(final Package elt) {
        super(elt);
    }

    @objid ("e2df5621-cc23-4f96-99f5-e13e4b7f8425")
    public static final class MdaTypes {
        @objid ("2637b2eb-baf0-49e5-bec8-ba4942f39b59")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("71c912a6-72e2-4730-84bf-4f8323ca45cf")
        private static Stereotype MDAASSOCDEP;

        @objid ("aedf8cc3-3dad-45af-9d4e-fb0c31e3718e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bd3f0900-eb22-4941-8b5f-de8d61e869ef")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e9c199d4-1f22-4720-a79c-39ebaf36e7bb");
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
