/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
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
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << MmsConceptInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("28cc79c1-8e23-4dd7-b100-83242c265aac")
public class MmsConceptInstance extends MmsObject {
    @objid ("af04086d-d74f-4ac2-8f33-79ce122af06b")
    public static final String STEREOTYPE_NAME = "MmsConceptInstance";

    /**
     * Tells whether a {@link MmsConceptInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MmsConceptInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("721390c3-17c8-4e5f-9499-7cd426fd9281")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsConceptInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MmsConceptInstance >> then instantiate a {@link MmsConceptInstance} proxy.
     * 
     * @return a {@link MmsConceptInstance} proxy on the created {@link Instance}.
     */
    @objid ("f30d92ec-4960-417a-8e28-c697a927c814")
    public static MmsConceptInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MmsConceptInstance.STEREOTYPE_NAME);
        return MmsConceptInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link MmsConceptInstance} proxy from a {@link Instance} stereotyped << MmsConceptInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link MmsConceptInstance} proxy or <i>null</i>.
     */
    @objid ("5afba55b-04c7-438f-a961-725b780debaa")
    public static MmsConceptInstance instantiate(final Instance obj) {
        return MmsConceptInstance.canInstantiate(obj) ? new MmsConceptInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MmsConceptInstance} proxy from a {@link Instance} stereotyped << MmsConceptInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link MmsConceptInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2f4e335c-5c08-42fb-8352-ffc3ccd726ef")
    public static MmsConceptInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (MmsConceptInstance.canInstantiate(obj))
        	return new MmsConceptInstance(obj);
        else
        	throw new IllegalArgumentException("MmsConceptInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'propertyInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("438f72b9-7f82-4a27-9697-dae53b980b64")
    public void addPropertyInstance(final MmsPropertyInstance obj) {
        if (obj!=null)
          ((Instance) this.elt).getSlot().add(obj.getElement());
    }

    @objid ("abebd569-37af-4210-b233-a1459758c350")
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
        MmsConceptInstance other = (MmsConceptInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("b6090668-bc4e-40d4-8093-3687750b4338")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the values of the 'propertyInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0df4e68a-4f68-464f-95d1-6a0e574e4310")
    public List<MmsPropertyInstance> getPropertyInstance() {
        List<MmsPropertyInstance> results = new ArrayList<>();
        for (AttributeLink mObj : ((Instance) this.elt).getSlot()){
        	if (MmsPropertyInstance.canInstantiate(mObj))
        			results.add((MmsPropertyInstance)CamelDesignerProxyFactory.instantiate(mObj, MmsPropertyInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("005dfd42-526c-4642-8173-06fbf82c9c3d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'propertyInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4676605c-995b-4396-99ce-b2faa4e30c01")
    public boolean removePropertyInstance(final MmsPropertyInstance obj) {
        return (obj!=null)? ((Instance) this.elt).getSlot().remove(obj.getElement()) : false;
    }

    @objid ("2baa6855-5b67-45db-8394-3b858da971ce")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("e3466404-fec7-4ecf-a72e-a71565f38d8a")
    protected MmsConceptInstance(final Instance elt) {
        super(elt);
    }

    @objid ("862d75e0-5992-4012-8c83-7a0ec8b66ab5")
    public static final class MdaTypes {
        @objid ("a140788c-6b95-498b-987a-02b9ceb40737")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1bd09654-ac17-44e9-9a8e-55da0e0f9654")
        private static Stereotype MDAASSOCDEP;

        @objid ("69a2eadf-434b-4b67-8bca-21389c21c1fb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("44df2269-a832-46e9-bc53-57e6ef7b8c69")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "81bc1a2f-1255-41fb-b517-5ca503ccc73e");
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
