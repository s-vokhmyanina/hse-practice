package libact4e.impl.categories_representation;
import libact4e.SemiCategory;
import libact4e.Setoid;
import libact4e.impl.helper.IOHelper;

import java.util.concurrent.Callable;

public interface SemiCategoryRepresentation<OD, MD> {
    SemiCategory<RichObject<OD>> load(IOHelper h,
                                                        FiniteSemiCategory_desc<MD> data,
                                                        Setoid<OD> ObData,
                                                        Setoid<MD> MorData,
                                                        Callable<MD> compose);
}
