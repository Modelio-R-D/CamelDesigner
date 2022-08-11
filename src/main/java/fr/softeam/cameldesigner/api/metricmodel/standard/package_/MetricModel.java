/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("ada0d087-b4d1-468f-b73d-3f816753f144")
    public static final String STEREOTYPE_NAME = "MetricModel";

    /**
     * Tells whether a {@link MetricModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetricModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e27ddcd4-2927-4ef5-b25d-d7709fcc23a6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricModel.STEREOTYPE_NAME));
    }

    @objid ("01e26885-0c8d-46be-8608-b058f85c6f67")
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
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("750d7713-f80f-4fea-8e76-91dc16c7b677")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("2ecda1e5-e05e-465f-b0e3-fa395c932200")
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

    @objid ("d374cb99-88fa-45c6-b78b-2e31eec51118")
    protected MetricModel(final Package elt) {
        super(elt);
    }

    @objid ("e2df5621-cc23-4f96-99f5-e13e4b7f8425")
    public static final class MdaTypes {
        @objid ("658ae95e-1e42-4f1e-87d0-eeb5fb2643c7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c53264bf-06e9-45cc-9ed7-e39d8b165229")
        private static Stereotype MDAASSOCDEP;

        @objid ("21c25e52-4ce3-47a8-8c45-6c4763289934")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6bb44949-46a1-491b-81fb-75cc662e52b7")
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
