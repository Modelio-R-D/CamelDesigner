/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
    @objid ("821c9795-784d-4953-a1b4-bff4c50719e4")
    public static final String STEREOTYPE_NAME = "MetricModel";

    /**
     * Tells whether a {@link MetricModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetricModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("69d99579-ae32-43f3-a9a7-23a5a9f09f85")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricModel.STEREOTYPE_NAME));
    }

    @objid ("042deb3f-ce20-4681-86f4-84935d1cd9aa")
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
    @objid ("f2bc1f2b-e772-4ef2-b177-a08d85ebe7d2")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("b49a5864-b0ef-43d2-a3de-76b34bb54934")
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

    @objid ("33c65943-82be-4430-a95e-70ddf08cc28a")
    protected MetricModel(final Package elt) {
        super(elt);
    }

    @objid ("e2df5621-cc23-4f96-99f5-e13e4b7f8425")
    public static final class MdaTypes {
        @objid ("701889ec-51fc-4e5a-a600-06900a1b3508")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fd03a770-cd2b-4fdf-a2cb-99a0b695ccd9")
        private static Stereotype MDAASSOCDEP;

        @objid ("6a4fca70-d06c-4160-940a-fd1370c86666")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7d90c4a3-b3ce-4b9b-9d8c-db041885422f")
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
